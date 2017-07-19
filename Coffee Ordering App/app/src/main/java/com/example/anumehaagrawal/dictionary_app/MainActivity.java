package com.example.anumehaagrawal.dictionary_app;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.content.Intent;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int incrvalue=0;

     Boolean mcheckwc;
    Boolean mcheckcho;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        CheckBox checkbox =(CheckBox) findViewById(R.id.checkBox);
        CheckBox checkbox2 =(CheckBox) findViewById(R.id.checkBox2);
        mcheckwc =checkbox.isChecked();
        mcheckcho=checkbox2.isChecked();
        int n= price();
        EditText nametext=(EditText) findViewById(R.id.editText) ;
        String name = nametext.getText().toString();
        String finalmessage=createOrderSummary(n,incrvalue,mcheckwc,mcheckcho , name);
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setType("*/*");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Coffee order for"+ name);
        intent.putExtra(Intent.EXTRA_TEXT,finalmessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
    private int price(){
        int p;
        p=5*incrvalue;
        if(mcheckcho==true){
            p=p+2;
        }
        if(mcheckwc==true)
            p=p+1;
        return p;
    }
    private String createOrderSummary(int pr,int quant,Boolean valuecheck ,Boolean chococheck ,String name){
        String val="Name:"+name+ "\n Quantity:"+quant+"\n Price:"+pr+"\n Add Whipped Cream?"+valuecheck+"\n Add Chocolate?" + chococheck + "\n Thank You";
        return val;
    }

    public void increment(View view){
        if(incrvalue>100)
            display(100);
        else
        display(++incrvalue);
    }
    public void decrement(View view){
        if(incrvalue<0)
            display(1);
        else
        display(--incrvalue);
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */

}

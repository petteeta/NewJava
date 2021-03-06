// packages com.glacierwebcreative.justjava; *******************************


package com.glacierwebcreative.justjava;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import java.lang.reflect.Method;
import java.text.NumberFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.glacierwebcreative.justjava.R;


// This app displays an order form to order coffee.  ********************

public class MainActivity extends AppCompatActivity {
    int quantity = 0;
    int price = 0;
    boolean hasWhippedCream = false;

    // Main Activity Method  *******************************************

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // Increment Button Method  **************************************************

    public void increment(View view) {
        quantity = quantity + 1;
        displayQuantity(quantity);

    }


    // Decrement Button Method ***************************************************

    public void decrement(View view) {
        quantity = quantity - 1;
        displayQuantity(quantity);

    }


    //Display Quantity Method *****************************************************

    private void displayQuantity(int howMany) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(howMany);
    }


    // This method displays the given text on the screen.  *********************

    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }


    // Calculates the price of the order.

    public int calculatePrice(int quantity, int pricePerCup) {
        return quantity * pricePerCup;

    }


    // Order Button Method *****************************************************

    public void submitOrder(View view) {
        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.checkBox);
        hasWhippedCream = whippedCreamCheckBox.isChecked();

        price = calculatePrice(quantity, 10);
        displayMessage(createOrderSummary(price));
    }


    //  Create Order Summary Method *********************************************

    public String createOrderSummary(int price) {
        String priceMessage = "Name = Kaptain Kunal";
        priceMessage += "\nAdd Whipped Cream? " + hasWhippedCream;
        priceMessage += "\nQuantity = " + quantity;
        priceMessage += "\nTotal = $" + price;
        priceMessage += "\nThank You!";
        return priceMessage;
    }
}

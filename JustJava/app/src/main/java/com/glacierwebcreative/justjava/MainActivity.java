/**
 * package com.glacierwebcreative.justjava;
 */
package com.glacierwebcreative.justjava;

import java.text.NumberFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.glacierwebcreative.justjava.R;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 0;

    /**
     * Main Activity Method
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Order Button
     */
    public void submitOrder(View view) {
        int price = quantity * 10;
        String priceMessage = "Total: $" + price;
        priceMessage = priceMessage + "\nThank You";
        displayMessage(priceMessage);
    }

    /**
     * Increment Button
     */
    public void increment(View view) {
        quantity = quantity + 1;
        display(quantity);
        displayPrice(quantity * 10);
    }

    /**
     * Decrement Button
     */
    public void decrement(View view) {
        quantity = quantity - 1;
        display(quantity);
        displayPrice(quantity * 10);
    }

    /**
     * Display Quantity
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * Display Price
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

}

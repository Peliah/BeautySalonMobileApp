package se3.pdt.beautysalon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PaymentActivity extends AppCompatActivity {

    private EditText cardNumberEditText;
    private EditText expDateEditText;
    private EditText cvvEditText;
    private Button submitPaymentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        cardNumberEditText = findViewById(R.id.card_number_edit_text);
        expDateEditText = findViewById(R.id.exp_date_edit_text);
        cvvEditText = findViewById(R.id.cvv_edit_text);
        submitPaymentButton = findViewById(R.id.submit_payment_button);

        submitPaymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cardNumber = cardNumberEditText.getText().toString().trim();
                String expDate = expDateEditText.getText().toString().trim();
                String cvv = cvvEditText.getText().toString().trim();

                if (validateInput(cardNumber, expDate, cvv)) {
                    submitPayment(cardNumber, expDate, cvv);
                }
            }
        });
    }

    private boolean validateInput(String cardNumber, String expDate, String cvv) {
            if (cardNumber.isEmpty()) {
                cardNumberEditText.setError("Card number is required");
                cardNumberEditText.requestFocus();
                return false;
            }

            if (cardNumber.length() != 16) {
                cardNumberEditText.setError("Invalid card number");
                cardNumberEditText.requestFocus();
                return false;
            }

            if (expDate.isEmpty()) {
                expDateEditText.setError("Expiration date is required");
                expDateEditText.requestFocus();
                return false;
            }

            if (cvv.isEmpty()) {
                cvvEditText.setError("CVV is required");
                cvvEditText.requestFocus();
                return false;
            }

            if (cvv.length() != 3) {
                cvvEditText.setError("Invalid CVV");
                cvvEditText.requestFocus();
                return false;
            }

            return true;
        }


    private void submitPayment(String cardNumber, String expDate, String cvv) {
        //Create a new Payment object here
        //and pass the credit card information
        //to the Stripe API to process the payment
    }
}

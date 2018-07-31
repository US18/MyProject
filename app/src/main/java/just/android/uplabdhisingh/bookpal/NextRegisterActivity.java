package just.android.uplabdhisingh.bookpal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class NextRegisterActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{

    Spinner plansSpinner;
    String tenDays = "10 Days";
    String twoBooks = "2 Books Plan";
    String monthly = "Monthly";
    String eventSpecial = "Event Special";
    String familySpecial = "Family Special";

    TextView planFeeTV, oneTimeRegFeeTV, refundDepositFeeTV, durationTV;
    Button submitButton;
    LinearLayout plansDetailsLL;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_register);

        plansSpinner = (Spinner) findViewById(R.id.spinner_plans);
        planFeeTV = (TextView) findViewById(R.id.tv_plansFee);
        oneTimeRegFeeTV = (TextView) findViewById(R.id.tv_oneTimeRegFee);
        refundDepositFeeTV = (TextView) findViewById(R.id.tv_refundDepositFee);
        durationTV = (TextView) findViewById(R.id.tv_duration);
        submitButton = (Button) findViewById(R.id.btn_submit);
        plansDetailsLL = (LinearLayout) findViewById(R.id.ll_plansDetails);

        plansSpinner.setOnItemSelectedListener(this);

        List<String> plans = new ArrayList<String>();
        plans.add(tenDays);
        plans.add(twoBooks);
        plans.add(monthly);
        plans.add(eventSpecial);
        plans.add(familySpecial);

        ArrayAdapter<String> plansAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, plans);
        plansAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        plansSpinner.setAdapter(plansAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        String itemSelected = parent.getItemAtPosition(position).toString();

        if(itemSelected.equals(tenDays))
        {
            plansDetailsLL.setVisibility(View.VISIBLE);
            submitButton.setVisibility(View.VISIBLE);
            planFeeTV.setText("Plan Fee : 300");
            oneTimeRegFeeTV.setText("One Time Regd Fee : 0");
            refundDepositFeeTV.setText("Refundable Deposit Fee (Rs.) : 0");
            durationTV.setText("Duration : 10 Days");
        } else if(itemSelected.equals(twoBooks))
        {
            plansDetailsLL.setVisibility(View.VISIBLE);
            submitButton.setVisibility(View.VISIBLE);
            planFeeTV.setText("Plan Fee : 2000");
            oneTimeRegFeeTV.setText("One Time Regd Fee : 0");
            refundDepositFeeTV.setText("Refundable Deposit Fee (Rs.) : 0");
            durationTV.setText("Duration : 180 Days");
        } else if (itemSelected.equals(monthly))
        {
            plansDetailsLL.setVisibility(View.VISIBLE);
            submitButton.setVisibility(View.VISIBLE);
            planFeeTV.setText("Plan Fee : 500");
            oneTimeRegFeeTV.setText("One Time Regd Fee : 0");
            refundDepositFeeTV.setText("Refundable Deposit Fee (Rs.) : 0");
            durationTV.setText("Duration : 30 Days");
        } else if (itemSelected.equals(eventSpecial)) {
            plansDetailsLL.setVisibility(View.VISIBLE);
            submitButton.setVisibility(View.VISIBLE);
            planFeeTV.setText("Plan Fee : 1500");
            oneTimeRegFeeTV.setText("One Time Regd Fee : 0");
            refundDepositFeeTV.setText("Refundable Deposit Fee (Rs.) : 0");
            durationTV.setText("Duration : 30 Days");
        } else if (itemSelected.equals(familySpecial)) {
            plansDetailsLL.setVisibility(View.VISIBLE);
            submitButton.setVisibility(View.VISIBLE);
            planFeeTV.setText("Plan Fee : 5000");
            oneTimeRegFeeTV.setText("One Time Regd Fee : 0");
            refundDepositFeeTV.setText("Refundable Deposit Fee (Rs.) : 500");
            durationTV.setText("Duration : 365 Days");
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

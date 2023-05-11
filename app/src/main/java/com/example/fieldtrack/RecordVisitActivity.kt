package com.example.fieldtrack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


// TODO: Implement View Binding
// TODO: Implement Form Validation
// TODO: Implement Handling of Exceptions

class RecordVisitActivity : AppCompatActivitys() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_record_visit)

        val submitButton = findViewById<Button>(R.id.submit_button)
        submitButton.setOnClickListener {
            // Handle form submission here
            handleSubmitForm()
        }
    }

    private fun handleSubmitForm() {
        // Fetch form data here
        val branchName = findViewById<TextView>(R.id.branch_name).text.toString()
        val userName = findViewById<TextView>(R.id.user_name).text.toString()
        val checkinTime = findViewById<EditText>(R.id.checkin_time).text.toString()
        val checkoutTime = findViewById<EditText>(R.id.checkout_time).text.toString()
        val companyName = findViewById<EditText>(R.id.company_name).text.toString()
        val contactPerson = findViewById<EditText>(R.id.contact_person).text.toString()

        val initialPurposeGroup = findViewById<RadioGroup>(R.id.initial_purpose)
        val selectedPurposeId = initialPurposeGroup.checkedRadioButtonId
        val initialPurpose = findViewById<RadioButton>(selectedPurposeId)?.text.toString()

        val amount = findViewById<EditText>(R.id.amount).text.toString()
        val meetingNotes = findViewById<EditText>(R.id.meeting_notes).text.toString()

        // Create a data object
        val visitData = VisitData(
            branchName,
            userName,
            checkinTime,
            checkoutTime,
            companyName,
            contactPerson,
            initialPurpose,
            amount.toDoubleOrNull(),
            meetingNotes
        )

        // TODO: Send visitData to your server or database
    }
}

// Data class to hold the form data
data class VisitData(
    val branchName: String,
    val userName: String,
    val checkinTime: String,
    val checkoutTime: String,
    val companyName: String,
    val contactPerson: String,
    val initialPurpose: String,
    val amount: Double?,
    val meetingNotes: String
)
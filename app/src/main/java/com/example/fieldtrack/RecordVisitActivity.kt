package com.example.fieldtrack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class RecordVisitActivity : AppCompatActivity() {

    // Declare fields at the class level so you can access them later
    private lateinit var etBranchName: EditText
    private lateinit var etUserName: EditText
    private lateinit var etCheckIn: EditText
    private lateinit var etCheckOut: EditText
    private lateinit var etCompanyName: EditText
    private lateinit var etContactPerson: EditText
    private lateinit var rgPurpose: RadioGroup
    private lateinit var etAmount: EditText
    private lateinit var etNotes: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_record_visit)

        val formLayout = findViewById<LinearLayout>(R.id.formLayout)

        // Create the fields
        etBranchName = createEditText("Branch Name")
        etUserName = createEditText("User Name")
        etCheckIn = createEditText("Check-in Time")
        etCheckOut = createEditText("Check-out Time")
        etCompanyName = createEditText("Company Name")
        etContactPerson = createEditText("Contact Person Name")
        rgPurpose =
            createRadioGroup("Initial Purpose", arrayOf("Order-Lead", "Cold-Visit", "Collection"))
        etAmount = createEditText("Amount")
        etNotes = createEditText("Brief Meeting Notes")

        // Add fields to the layout
        formLayout.addView(etBranchName)
        formLayout.addView(etUserName)
        formLayout.addView(etCheckIn)
        formLayout.addView(etCheckOut)
        formLayout.addView(etCompanyName)
        formLayout.addView(etContactPerson)
        formLayout.addView(rgPurpose)
        formLayout.addView(etAmount)
        formLayout.addView(etNotes)

        // Set fields as non-editable as required
        etBranchName.isEnabled = false
        etUserName.isEnabled = false
        etCheckIn.isEnabled = false
        etCheckOut.isEnabled = false

        // Fetch and set data for non-editable fields
        // (Replace "Placeholder" with actual data)
        etBranchName.setText("Placeholder")
        etUserName.setText("Placeholder")
        etCheckIn.setText("Placeholder")
        etCheckOut.setText("Placeholder")
    }

    private fun createEditText(hint: String): EditText {
        return EditText(this).apply {
            this.hint = hint
        }
    }

    private fun createRadioGroup(title: String, options: Array<String>): RadioGroup {
        val radioGroup = RadioGroup(this)
        radioGroup.addView(TextView(this).apply { text = title })
        for (option in options) {
            radioGroup.addView(RadioButton(this).apply { text = option })
        }
        return radioGroup
    }
}
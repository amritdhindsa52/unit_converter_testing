import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputField: EditText = findViewById(R.id.inputField)
        val unitTypeSpinner: Spinner = findViewById(R.id.unitTypeSpinner)
        val convertButton: Button = findViewById(R.id.convertButton)
        val resultTextView: TextView = findViewById(R.id.resultTextView)

        val unitTypes = arrayOf("Temperature", "Length", "Weight")
        unitTypeSpinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, unitTypes)

        convertButton.setOnClickListener {
            val inputValue = inputField.text.toString().toDouble()
            val selectedUnitType = unitTypeSpinner.selectedItem.toString()

            val result = when (selectedUnitType) {
                "Temperature" -> convertTemperature(inputValue)
                "Length" -> convertLength(inputValue)
                "Weight" -> convertWeight(inputValue)
                else -> 0.0
            }

            resultTextView.text = result.toString()
        }
    }

    private fun convertTemperature(value: Double): Double {
        // Example: Convert Celsius to Fahrenheit
        return (value * 9/5) + 32
    }

    private fun convertLength(value: Double): Double {
        // Example: Convert meters to feet
        return value * 3.28084
    }

    private fun convertWeight(value: Double): Double {
        // Example: Convert kilograms to pounds
        return value * 2.20462
    }
}

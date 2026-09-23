package com.zerocrime.hardeningtool

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. इमरजेंसी 1930 डायलर
        findViewById<Button>(R.id.btnCyberHelpline).setOnClickListener {
            startActivity(Intent(Intent.ACTION_DIAL, Uri.parse("tel:1930")))
        }

        // 2. Private DNS
        findViewById<Button>(R.id.btnDns).setOnClickListener {
            startActivity(Intent(Settings.ACTION_NETWORK_OPERATOR_SETTINGS))
        }

        // 3. कॉलर ID व डिफ़ॉल्ट डायलर
        findViewById<Button>(R.id.btnSpam).setOnClickListener {
            startActivity(Intent(Settings.ACTION_MANAGE_DEFAULT_APPS_SETTINGS))
        }

        // 4. कॉल फॉरवर्डिंग कैंसिलेशन (##002#)
        findViewById<Button>(R.id.btnCallForwardCancel).setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + Uri.encode("##002#")))
            startActivity(intent)
        }

        // 5. अनजान ऐप्स लॉक
        findViewById<Button>(R.id.btnUnknownApps).setOnClickListener {
            startActivity(Intent(Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES))
        }

        // 6. एक्सेसिबिलिटी सेटिंग्स
        findViewById<Button>(R.id.btnAccessibility).setOnClickListener {
            startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS))
        }

        // 7. संचार साथी पोर्टल
        findViewById<Button>(R.id.btnTafcop).setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://tafcop.sancharsaathi.gov.in/telecomUser/")))
        }

        // 8. आधार बायोमेट्रिक लॉक
        findViewById<Button>(R.id.btnAadhaarLock).setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://myaadhaar.uidai.gov.in/lock-unlock-biometrics")))
        }
    }
}

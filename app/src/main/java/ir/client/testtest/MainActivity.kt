package ir.client.testtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    class CheckNumber {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgeven.setOnClickListener{
            val e = MainActivity()
            e.checkNumber()
            if (e.equals(0))
                return@setOnClickListener

        }
        btnodd.setOnClickListener {
            val o = MainActivity()
            o.checkNumber()
            if (o.equals(1))
                return@setOnClickListener
        }
    }

     fun checkNumber() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

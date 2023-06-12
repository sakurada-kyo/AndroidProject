package com.example.testapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.testapp.ui.theme.TestAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.draw_view)

        //５）Viewの取得⇒クリア処理
        val myView :MyView =findViewById(R.id.myView)
        val btnClear:Button =findViewById(R.id.btnClear)

        btnClear.setOnClickListener {
            myView.clearCanvas()
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//            text = "Hello $name!",
//            modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    TestAppTheme {
//        Greeting("Android")
//    }
//}
package com.jc.kotlinuipractice_20220215

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        버튼이 눌릴때 -> 입렵된 메세지가 어떤건지 추출. -> 토스트로 띄워주기 -> 텍스트 뷰의 문구로 반영하기
        btnOk.setOnClickListener {
//            버튼이 눌릴 때마다 실행
//             -> 입력된 메세지는? 변수에 담아두자.

            val inputMessage = edtMessage.text.toString()   // EditText 의 메시지의 문구 (text)를 추출 -> String 으로 변환까지

            Toast.makeText(this, inputMessage, Toast.LENGTH_SHORT).show()

//            담겨있는 입력문구를 -> 텍스트뷰의 text 속성의 값으로 대입.
            txtMessage.text = inputMessage                  // TextView 의 문구 (text)를 변경 (set)

        }

        btnCalculate.setOnClickListener {
//            입력한 숫자 추출.
            val inputNumber = edtNumber.text.toString().toInt()    // 입력한 문구 추출 > String 으로 > Int 로 변환

//            숫자가 짝수인가? => 조건문 if 문 활용
            if (inputNumber % 2 == 0) {
                Toast.makeText(this, "입력한 숫자는 짝수 입니다.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "입력한 숫자는 홀수 입니다.", Toast.LENGTH_SHORT).show()
            }

        }

    }
}
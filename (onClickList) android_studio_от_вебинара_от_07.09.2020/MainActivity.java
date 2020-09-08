/* Задание: Сделать кнопку "НЕТ", чтобы на экране показывалось уведомление неправильно*/


/* Ответ (Исправил) */


package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button trueBtn; /* кнопка ДА */
    private Button falseBtn; /* кнопка НЕТ */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trueBtn = findViewById(R.id.trueBtn);
        falseBtn = findViewById(R.id.falseBtn);

        trueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.correct_toast,Toast.LENGTH_SHORT).show();
            }
        });
        falseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.incorrect_toast,Toast.LENGTH_SHORT).show();
            }
        });
    }
}








// package com.example.myapplication;

// import androidx.appcompat.app.AppCompatActivity;

// import android.os.Bundle;
// import android.view.View;
// import android.widget.Button;
// import android.widget.Toast;

// public class MainActivity extends AppCompatActivity {

//     private Button trueBtn; /* кнопка ДА */
//     private Button falseBtn; /* кнопка НЕТ */

//     @Override
//     protected void onCreate(Bundle savedInstanceState) {
//         super.onCreate(savedInstanceState);
//         setContentView(R.layout.activity_main);

//         trueBtn = findViewById(R.id.trueBtn); /поиск индификатора id кнопки ДА/
//         falseBtn = findViewById(R.id.falseBtn); /поиск индификатора id кнопки НЕТ/

//         trueBtn.setOnClickListener(new View.OnClickListener() {
//             @Override
//             public void onClick(View view) {
//                 Toast.makeText(MainActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
//             }
//         });
//         falseBtn.setOnClickListener(new View.OnClickListener() {
//             @Override
//             public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Неправильно", Toast.LENGTH_SHORT).show();
//             }
//         });
//     }
// }

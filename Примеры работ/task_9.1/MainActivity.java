package com.example.myapplication;  // Название пакета

import androidx.appcompat.app.AppCompatActivity; // - подключение внешней библиотеки androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle; // - подключение внешней библиотеки
import android.util.Log; // - подключение внешней библиотеки
import android.view.View; // - подключение внешней библиотеки по Вью методы
import android.widget.Button; // - подключение внешней библиотеки про кнопки
import android.widget.TextView; // - подключение внешней библиотеки по ТекстВью методы
import android.widget.Toast; // - подключение внешней библиотеки

public class MainActivity extends AppCompatActivity { // - создаем новый класс MainActivity на базе расширения класса AppCompatActivity

    private Button trueBtn; // - Обьявляем закрытую в классе кнопку trueBtn (правильный ответ)
    private Button falseBtn; // - Обьявляем закрытую в классекнопку falseBtn (неправильный ответ)
    private TextView textView; // - Объявляем закрытый  в классе новый обьект textView
    private Question[] questions = { // - Объявляем номерной закрытый в классе массив questions типа Question[] из вопросов и правильного типа ответа на него
            new Question(R.string.question1,true), // - Инициализируем массив значениями по очереди перечислением значений из ресурса R.string
            new Question(R.string.question2,false), // -  Инициализируем массив значениями по очереди перечислением значений из ресурса R.string
            new Question(R.string.question3,true), // -  Инициализируем массив значениями по очереди перечислением значений из ресурса R.string
            new Question(R.string.question4,false), // -  Инициализируем массив значениями по очереди перечислением значений из ресурса R.string
            new Question(R.string.question5,true) // - Инициализируем массив значениями по очереди перечислением значений из ресурса R.string
    }; // - Закрываем инициализацию значений
    private int currentIndex=0; // - Обьявляем внутреннюю закрытую переменную currentIndex типа int для фиксации номера текущего вопроса в приложении и инициализируем её первичным значением 0. В конце ставим точку с запятой.

    private String TAG = "Информация о запуске метода: "; // - Обьявляем внутреннюю закрытую переменную TAG типа String для отображения и поиска сообщений данного скрипта в листе логов.
    @Override // - Указываем на переопределение метода родительского класса.
    protected void onCreate(Bundle savedInstanceState) { // - название переопределяемого метода родительского класса onCreate
        super.onCreate(savedInstanceState); // - запускаем на выполнение onCreate метод родительского класса
        Log.d(TAG,"Метод onCreate() запущен!"); // - выводим в лист логов сообщение о состоявшемся запуске наследуемого метода onCreate()

        setContentView(R.layout.activity_main); // - подключение формы дизайна активности из файла-ресурса activity_main.xml
        if (savedInstanceState != null){ // - условие - если индекс текущей активности был установлен ранее и отличается от начального пустого значения null
            currentIndex = savedInstanceState.getInt("index"); // - получение индекса текущего вопроса при восстановлении окна активности
        } // -
        trueBtn = findViewById(R.id.trueBtn); // - установка соответствия между переменной trueBtn и оконным объектом для вывода текса в Активности имеющим идентификатор trueBtn
        falseBtn= findViewById(R.id.falseBtn); // - установка соответствия между переменной falseBtn и оконным объектом для выводв текса имеющим идентификатор falseBtn
        textView= findViewById(R.id.textView); // - установка соответствия между переменной textView и оконным объектом имеюшим для вывода текса идентификатор textView

        int question = questions[currentIndex].getQuestionTextId(); // - получаем в целую переменную question номер текущего вопроса из массива вопросов questions
        // используя индекс currentIndex в качестве номера текущего вопроса с помощью геттера  getQuestionTextId() класса Question
        textView.setText(question); // - помещаем в визуальное поле с меткой textView текст с помоью Сеттера setText() класса Question вопрос под номером question

        trueBtn.setOnClickListener(new View.OnClickListener() { // - Обработчик события нажатия на кнопку "Правильно"
            @Override // - переопределяем родительский метод нажатия на кнопку onClick кнопки "Правильно" trueBtn
            public void onClick(View view) { // - определяем новый код наследуемого метода onClick
                checkAnswer(true); // - Проверяем правильность ответа пользователя методом checkAnswer().
                updateQuestion(); // - запускаем на экран телефона отображение следующего вопроса методом updateQuestion(). Описание метода см ниже по тексту.
            } // - конец переопределямого метода onClick
        }); // -конец метода trueBtn.setOnClickListener()

        falseBtn.setOnClickListener(new View.OnClickListener() { // - Обработчик события нажатия на кнопку "Не правильно"
            @Override // - переопределяем родительский метод нажатия на кнопку onClick кнопки "Не праильно" falseBtn
            public void onClick(View view) { // - определяем новый код наследуемого метода onClick
                checkAnswer(false); // - Проверяем правильность ответа пользователя методом checkAnswer().
                updateQuestion(); // - запускаем на экран телефона отображение следующего вопроса методом updateQuestion(). Описание метода см ниже по тексту.
            } // - конец переопределямого метода onClick
        }); // -конец метода falseBtn.setOnClickListener()
    } // - Конец метода protected void onCreate();

    private void updateQuestion(){ // - Метод производящий переход Активности к новому вопросу
        currentIndex=(currentIndex+1)%questions.length; // - увеличение номера вопроса на один если номер не превышает размера массива вопросов questions.length
        textView.setText(questions[currentIndex].getQuestionTextId()); // - устанавливаем в вихуальный объект textView текст следующего вопроса за номером currentIndex с помощью геттера getQuestionTextId()
    } // - конец описания метода updateQuestion()

    private  void checkAnswer(boolean userAnswer){ // - Метод проверяющий правильность данного пользователем ответа на отображаемый вопрос.
        if (questions[currentIndex].isAnswerTrue() == userAnswer) // - Если данный пользователем ответ совпадает с типом правильного ответа натекущий вопрос
            Toast.makeText(MainActivity.this, R.string.correct_toast,Toast.LENGTH_SHORT).show(); // - Отобразить на активности оповещение R.string.correct_toast о верности ыбранного пользователем ответа
        else // - если ответ пользователя не совпал с типом правильного ответа в данном вопросе.
            Toast.makeText(MainActivity.this, R.string.incorrect_toast,Toast.LENGTH_SHORT).show(); // - Отобразить на активности оповещение R.string.incorrect_toast о неверности ыбранного пользователем ответа
    } // -конец метода проверки правильности ответа пользователя checkAnswer

    @Override // -
    public void onSaveInstanceState(Bundle savedInstanceState){ // - Переопределяем родительский метод onSaveInstanceState(Bundle savedInstanceState)
        super.onSaveInstanceState(savedInstanceState); // - запускаем родительский метод onSaveInstanceState
        Log.d(TAG,"Метод onSaveInstanceState() запущен!!!"); // - Выводим в логи сообщение о состоявшемся запуске метода onSaveInstanceState
        savedInstanceState.putInt("index",currentIndex); // - Записываем текущее состояние приложения из переменной currentIndex
    } // - Заканчиваем переопределение метода onSaveInstanceState

    @Override // - Переопределяем родительский метод onStart()
    public void onStart(){ // -
        super.onStart(); // - запускаем родительский метод onStart()
        Log.d(TAG,"Метод onStart() запущен"); // - Выводим в логи сообщение о состоявшемся запуске метода onStart()
    } // -  Заканчиваем переопределение метода onStart()

    @Override // - Переопределяем родительский метод onResume()
    public void onResume(){ // -
        super.onResume(); // - запускаем родительский метод onResume()
        Log.d(TAG,"Метод onResume() запущен"); // - Выводим в логи сообщение о состоявшемся запуске метода  onResume()
    }// -  Заканчиваем переопределение метода onResume()

    @Override // - Переопределяем родительский метод onPause()
    public void onPause(){ // -
        super.onPause(); // - запускаем родительский метод onPause()
        Log.d(TAG,"Метод onPause() запущен"); // - Выводим в логи сообщение о состоявшемся запуске метода onPause()
    } // - Заканчиваем переопределение метода onPause()

    @Override // - Переопределяем родительский метод  onStop()
    public void onStop(){ // -
        super.onStop(); // - запускаем родительский метод onStop()
        Log.d(TAG,"Метод onStop() запущен"); // - Выводим в логи сообщение о состоявшемся запуске метода onStop()
    } // - Заканчиваем переопределение метода onStop()

    @Override // - Переопределяем родительский метод onStart()
    public void onDestroy(){ // -
        super.onDestroy(); // - запускаем родительский метод onDestroy()
        Log.d(TAG,"Метод onDestroy() запущен"); // - Выводим в логи сообщение о состоявшемся запуске метода onDestroy()
    } // -  Заканчиваем переопределение метода onDestroy()

    @Override // - Переопределяем родительский метод onRestart()
    public void onRestart(){ // -
        super.onRestart(); // - запускаем родительский метод onRestart()
        Log.d(TAG,"Метод onRestart() запущен"); // - Выводим в логи сообщение о состоявшемся запуске метода onRestart()
    } // - Заканчиваем переопределение метода onRestart()

} // -закрываем описаие класса MainActivity

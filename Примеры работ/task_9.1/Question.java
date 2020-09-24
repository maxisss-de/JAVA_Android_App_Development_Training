package com.example.myapplication;  // - название пакета где лежит данный класс
// - пустая строка
public class Question { // - Обьявляем новый класс Question с общим доступом
    private int questionTextId; // - обьявляем локальную переменную questionTextId типа int для указания номера вопроса
    private boolean answerTrue; // - обьявляем локальную переменную answerTrue логического типа для указания правильного ответа вопросе

    public Question(int questionTextId, boolean answerTrue) { // - Конструктор класса Question для инициализации его полей при создании объекта типа Question
        this.questionTextId = questionTextId; // - инициализируем внутреннее поле обьекта this.questionTextId переданным в конструктор внешним значением questionTextId
        this.answerTrue = answerTrue; // - инициализируем внутреннее поле обьекта this.answerTrue переданным в конструктор внешним значением answerTrue
    } // -

    public int getQuestionTextId() { // - Описываем метод Get - getQuestionTextId для поля questionTextId класса  Question. Метод возвращает число типа int
        return questionTextId; // - возвращаем значение questionTextId
    } // -

    public void setQuestionTextId(int questionTextId) { // - Описываем метод установки значения Set - setQuestionTextId для поля questionTextId класса Question. Метод ничего не возвращает.
        this.questionTextId = questionTextId; // -устанавливаем значение внутренего поля this.questionTextId равным значению переданного внешнему значению questionTextId
    } // -

    public boolean isAnswerTrue() { // - метод isAnswerTrue() возвращает тип правильного ответа в экземпляре типа Question
        return answerTrue; // -
    } // -

    public void setAnswerTrue(boolean answerTrue) { // - установка типа правильного ответа в экземпляре класса Question
        this.answerTrue = answerTrue; // - присваиваем внутреннему полю экземпляра класса  Question значение answerTrue переданное при вызове метода setAnswerTrue
    } // - заканчиваем писание метода setAnswerTrue
} // - заканчиваем описание класса

# GoF

Запуск приложения

1. Запустите приложение с помощью MainApplication.


2. Откройте браузер и выполните GET-запрос:



http://localhost:8080/createOrder?type=online

или

http://localhost:8080/createOrder?type=instore


---

Вывод в консоли

1. Прокси логирует действия:

Logging: Creating order of type online

2. Сервис обрабатывает заказ:

Order created: online

3. Результат обработки:

Processing online order.

4. Прокси завершает логирование:

Logging: Order created successfully.

---

Результат

В этом приложении продемонстрированы следующие паттерны:

Singleton: OrderService создаётся в одном экземпляре.

Factory Method: OrderFactory создаёт заказы разных типов.

Observer: OrderEventListener реагирует на событие создания заказа.

Proxy: OrderServiceProxy добавляет логирование при работе с заказами.


Это приложение показывает, как паттерны проектирования работают вместе для создания гибкой и расширяемой архитектуры.

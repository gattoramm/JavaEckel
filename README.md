# JavaEckel

**Примеры и упражнения из книги Б. Эккель "Философия JAVA"**

## part2 - Все является объектом

### Ex1_DefaultInit
 Создайте класс с полями int и char, которые не инициализируются в программе. Выведите их значения, чтобы убедиться в том, чтo Java выполняет инициализацию по умолчанию.

 ### Ex6_Storage
 Напишите программу, включающую метод storage().

 ### Ex7_8_IncrementableStatic
Напишите программу с классом lncrementable, которая демонстрирует, что независимо от количества созданных объектов класс содержит только один экземпляр поля static.

### Ex9_PrimaryType
Напишите программу, демонстрирующую автоматическую упаковку примитивных типов.

## part3 - Операторы

### Ex2_AliasingFloat
 Создайте класс с полем типа float. Используйте его для демонстрации совмещения имен.

 ### Ex3_AliasingMethod
Создайте класс с полем типа float. Используйте его для демонстрации совмещения имен при вызове методов.
 ### Ex5_6_ObjectsEquals
Создайте класс Dog, содержащий два поля типа String: name и says. В методе main() создайте два объекта Dog с разными именами (spot и scruffy) и сообщениями. Выведите значения обоих полей для каждого из объектов. Создайте новую ссылку на Dog и присвойте ее объекту spot. Сравните ссылки оператором == и методом equals().

 ### Ex8_LongToBinary
Покажите, что шестнадцатеричная и восьмеричная записи могут использоваться с типом long. Для вывода результатов используйте метод Long.toBinaryString().

 ### Ex9_MinMaxFloatDoubleExponential
Выведите наибольшее и наименьшее число в экспоненциальной записи для типов float и double.

 ### Ex10_BinaryOperations
Напишите программу с двумя константами: обе константы состоят из чередующихся нулей и единиц, но у одной нулю равен младший бит, а у другой старший (подсказка: константы проще всего определить в шестнадцатеричном виде). Объедините эти две константы всеми возможными поразрядными операторами. Для вывода результатов используйте метод Integer.toBinaryString().

 ### Ex14_StringOperations
Напишите метод, который получает два аргумента String, выполняет с ними все операции логических сравнений и выводит результаты. Для операций == и I = также выполните проверку equals(). Вызовите свой метод из main() для нескольких разных объектов String.

## part4 - Управляющие конструкции

### control
Генерация случайных чисел до тех пор, пока не будет выполнено определенное условие.

### Ex15_100nums
Напишите программу, которая выводит числа от 1 до 100.

### Ex16_RandomInt
Напишите программу, которая генерирует 25 случайных значений типа int. Для каждого значения команда if-else сообщает, в каком отношении оно находится с другим случайно сгенерированным числом (больше, меньше, равно).

### Ex17_RandomIntInfinity
Измените упражнение 2 так, чтобы код выполнялся в «бесконечном» цикле while. Программа должна работать до тех пор, пока ее выполнение не будет прервано с клавиатуры.

### Ex20_MethodTest
Создайте метод test() так, чтобы он получал два аргумента begin и end, а значение testval проверялось на принадлежность к диапазону [ begin, end] (с включением границ).

## part5 - Инициализация и завершение

### Ex1_DefaultInit
Создайте класс с неинициализированной ссылкой на String. Покажите, что Java инициализирует ссылку значением null.

### Ex2_TwoObjConstrAndInit
Создайте класс с полем String, инициализируемым в точке определения, и другим полем, инициализируемым конструктором.

### Ex3_DefaultConstructor
Создайте класс с конструктором по умолчанию (без параметров), который выводит на экран сообщение. Создайте объект этого класса.

### Ex4_OverConstructors
Добавьте к классу из упражнения 3 перегруженный конструктор, принимающий в качестве параметра строку (String) и распечатывающий ее вместе с сообщением.

### Ex5_OverMethod
Создайте класс Dog (собака) с перегруженным методом bark() (лай). Методдолжен быть перегружен для разных примитивных типов данных с целью вывода сообщения о лае, завывании, поскуливании и т. п. в зависимости от версии перегруженного метода. Напишите метод main(), вызывающий все версии.

### Ex6_ReverseOverMethod
Измените предыдущее упражнение так, чтобы два перегруженных метода принимали два аргумента (разных типов) и отличались только порядком их следования в списке аргументов. Проверьте, работает ли это.

### Ex7_WithoutConstructor
Создайте класс без конструктора. Создайте объект этого класса в методе main(), чтобы удостовериться, что конструктор по умолчанию синтезируется автоматически.

### Ex8_This
Создайте класс с двумя методами. В первом методе дважды вызовите второй метод: один раз без ключевого слова this, а во второй с this — просто для того, чтобы убедиться в работоспособности этого синтаксиса; не используйте этот способ вызова на практике.

### Ex9_ThisConstructor
Подготовьте класс с двумя (перегруженными) конструкторами. Используя ключевое слово this, вызовите второй конструктор из первого.

### TerminaionCondition
Проверка "условия готовности" объекта.

### Ex10_Finalize
Создайте класс с методом finalize(), который выводит сообщение. В методе main() создайте объект вашего класса.

### OrderOfInitialization
Порядок инициализации

### StaticInitialization
Инициализация статической памяти

### EpclicitStatic
Инициализация static

### ArraysOfPrimitives
Копирование сслыки на массив

### ArrayInit/ArrayNew
Создание массива примитивных типов

### ArrayClassObj
Создание массива непримитивных объектов

### ArrayInit/ArrayInit
Инициализация массивов объектов

### DynamicArray
Создание массива объектов String для передачи альтернативных аргументов командной строки методу main() другого класса

### Ex16_ArraysString
Создайте массив объектов String. Присвойте объект String каждому элементу. Выведите содержимое массива в цикле for.

### Ex17_18ArraysStringWithConctructor
Создайте класс с конструктором, получающим аргумент String. Выведите значение аргумента во время конструирования. Создайте массив ссылок на этот класс, но не создавайте объекты, которыми заполняется массив. Запустите программу и посмотрите, будут ли выводиться сообщения при вызове конструкторов. Создайте объекты, которыми заполняется массив ссылок.

### VarArgs/VarArgs
Производные классы от общего корневого класса Object

### VarArgs/NewVarArgs
Определения переменного списка аргументов через многоточие

### OptionalTrailingArguments
Список аргументов переменной длины

### VarArgs/VarargType
Список аргументов переменной длины в массив

### VarArgs/AutoboxingVarargs
Автоматическая упаковка

### VarArgs/OverloadingVarargs
Списки аргументов переменной длины

### VarArgs/OverloadingVarargs2
Списки аргументов переменной длины. В одном из методов аргумент «постоянной длины»

### VarArgs/OverloadingVarargs3
Списки аргументов переменной длины. В обоих методах аргумент «постоянной длины»
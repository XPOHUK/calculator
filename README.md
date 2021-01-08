# calculator
### Проект "Калькулятор" по ТЗ от Java-Mentor

#### Описание:
Необходимо создать консольное приложение “Калькулятор”. Приложение должно читать из консоли введенные пользователем
арифметические операции и выводить в консоль результат их выполнения.

#### Требования:
* Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b. Данные передаются в одну строку (смотрите пример)! Решения, в которых каждое число и арифмитеческая операция передаются с новой строки считаются неверными.
* Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числами.
* Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более. На выходе числа не ограничиваются по величине и могут быть любыми.
* Калькулятор умеет работать только с целыми числами.
* Калькулятор умеет работать только с арабскими или римскими цифрами одновременно, при вводе пользователем строки вроде 3 + II калькулятор должен выбросить исключение и прекратить свою работу.
* При вводе римских чисел, ответ должен быть выведен римскими цифрами, соответственно, при вводе арабских - ответ ожидается арабскими.
* При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.
* При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций, приложение выбрасывает исключение и завершает свою работу.

***Комментарий:*** *Программа немного доработана. Вместо завершения работы при неправильном вводе пользователю предлагается попробовать ещё раз*

***Комментарий:*** *Так как в ТЗ в примерах работы программы выражения передаются с пробелами между операндами и оператором, то программа примеры только в таком виде и принимает. Любые лишние пробелы или их отсутствие караются выбросом Exception.*

##### ToDo:
Необходимо избавиться от повторяющегося кода в конце класса ExpressionParser.

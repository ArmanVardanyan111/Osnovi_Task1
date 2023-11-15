fun main(args: Array<String>) {
    println("Введите строку")
    var a = readln()

    var ch = a[0]
    var value_ = 1
    for (i in 1 until  a.length)
    {
        if (ch != a[i])
        {
            print(ch)
            if (value_ > 1)
            {
                print(value_)
            }
            ch = a[i]
            value_ = 1
        }
        else
        {
            value_++
        }
    }
    if (value_ > 1)
    {
        print(ch)
        print(value_)
    }
}
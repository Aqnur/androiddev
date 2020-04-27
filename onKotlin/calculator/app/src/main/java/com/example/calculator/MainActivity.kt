package com.example.calculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var input: TextView
    private lateinit var signBox: TextView

    internal var sign: String? = null
    internal var value1: String? = null
    internal var value2: String? = null
    internal var operation: String? = null
    internal var num1: Double? = null
    internal var num2: Double? = null
    internal var result: Double? = null
    internal lateinit var back: Button
    internal var hasPoint: Boolean = false
    internal var checkNumber = true
    internal var checkOperation = false
    internal var equalCliked = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        input = findViewById(R.id.input)
        signBox = findViewById(R.id.sign)

        back = findViewById(R.id.del)

        back.isLongClickable = true

        back.setOnLongClickListener {
            input.text = null
            signBox.text = null
            value1 = null
            value2 = null
            sign = null
            hasPoint = false
            equalCliked = false
            checkOperation = false
            true
        }
        if (savedInstanceState != null) {
            value1 = savedInstanceState.getString("number1")
            value2 = savedInstanceState.getString("number2")
            checkNumber = savedInstanceState.getBoolean("checkNumber")
            hasPoint = savedInstanceState.getBoolean("hasPoint")
            equalCliked = savedInstanceState.getBoolean("equalClicked")
            input.text = savedInstanceState.getString("numberInput")
            checkOperation = savedInstanceState.getBoolean("checkOperation")
            signBox.text = savedInstanceState.getString("signInput")
            sign = savedInstanceState.getString("sign")
            operation = savedInstanceState.getString("operation")
        }
    }

    fun btnClick_0(view: View) {
        if (equalCliked) {
            input.text = null
            if (checkNumber)
                input.text = input.text.toString() + "0"
            equalCliked = false
        } else if (checkNumber) {
            if (input.text.toString() == "0") {
                input.text = "0"
            } else
                input.text = input.text.toString() + "0"
        }
    }

    fun btnClick_1(view: View) {
        if (equalCliked) {
            input.text = null
            if (checkNumber)
                input.text = input.text.toString() + "1"
            equalCliked = false

        } else if (checkNumber) {
            if (input.text.toString() == "0")
                input.text = "1"
            else
                input.text = input.text.toString() + "1"
        }
    }

    fun btnClick_2(view: View) {
        if (equalCliked) {
            input.text = null
            if (checkNumber)
                input.text = input.text.toString() + "2"
            equalCliked = false
        } else if (checkNumber) {
            if (input.text.toString() == "0") {
                input.text = "2"
            } else
                input.text = input.text.toString() + "2"
        }

    }

    fun btnClick_3(view: View) {
        if (equalCliked) {
            input.text = null
            if (checkNumber)
                input.text = input.text.toString() + "3"
            equalCliked = false

        } else if (checkNumber) {
            if (input.text.toString() == "0") {
                input.text = "3"
            } else
                input.text = input.text.toString() + "3"
        }

    }

    fun btnClick_4(view: View) {
        if (equalCliked) {
            input.text = null
            if (checkNumber)
                input.text = input.text.toString() + "4"
            equalCliked = false

        } else if (checkNumber) {
            if (input.text.toString() == "0") {
                input.text = "4"
            } else
                input.text = input.text.toString() + "4"
        }

    }

    fun btnClick_5(view: View) {
        if (equalCliked) {
            input.text = null
            if (checkNumber)
                input.text = input.text.toString() + "5"
            equalCliked = false

        } else if (checkNumber) {
            if (input.text.toString() == "0") {
                input.text = "5"
            } else
                input.text = input.text.toString() + "5"
        }

    }

    fun btnClick_6(view: View) {
        if (equalCliked) {
            input.text = null
            if (checkNumber)
                input.text = input.text.toString() + "6"
            equalCliked = false

        } else if (checkNumber) {
            if (input.text.toString() == "0") {
                input.text = "6"
            } else
                input.text = input.text.toString() + "6"
        }

    }

    fun btnClick_7(view: View) {
        if (equalCliked) {
            input.text = null
            if (checkNumber)
                input.text = input.text.toString() + "7"
            equalCliked = false

        } else if (checkNumber) {
            if (input.text.toString() == "0") {
                input.text = "7"
            } else
                input.text = input.text.toString() + "7"
        }

    }

    fun btnClick_8(view: View) {
        if (equalCliked) {
            input.text = null
            if (checkNumber)
                input.text = input.text.toString() + "8"
            equalCliked = false

        } else if (checkNumber) {
            if (input.text.toString() == "0") {
                input.text = "8"
            } else
                input.text = input.text.toString() + "8"
        }

    }

    fun btnClick_9(view: View) {
        if (equalCliked) {
            input.text = null
            if (checkNumber)
                input.text = input.text.toString() + "9"
            equalCliked = false
        } else if (checkNumber) {
            if (input.text.toString() == "0") {
                input.text = "9"
            } else
                input.text = input.text.toString() + "9"
        }


    }

    fun btnClick_divide(view: View) {

        if (checkOperation == false) {
            sign = "/"
            value1 = input.text.toString()
            input.text = null
            signBox.text = "/"
            hasPoint = false
            checkOperation = true

        } else {
            sign = "/"
            signBox.text = "/"
        }
    }

    fun btnClick_multiply(view: View) {

        if (checkOperation == false) {
            sign = "*"
            value1 = input.text.toString()
            input.text = null
            signBox.text = "*"
            hasPoint = false
            checkOperation = true

        } else {
            sign = "*"
            signBox.text = "*"
        }

    }

    fun btnClick_subtract(view: View) {

        if (checkOperation == false) {
            sign = "-"
            value1 = input.text.toString()
            input.text = null
            signBox.text = "-"
            checkOperation = true
            hasPoint = false
        } else {
            sign = "-"
            signBox.text = "-"
        }


    }

    fun btnClick_add(view: View) {

        if (checkOperation == false) {
            sign = "+"
            value1 = input.text.toString()
            input.text = null
            signBox.text = "+"
            hasPoint = false
            checkOperation = true

        } else {
            sign = "+"
            signBox.text = "+"
        }

    }

    fun btnClick_root(view: View) {
        if(input.text.toString().equals("0")) {
            input.text = "0"
        } else {
            if(input.text.toString().toDouble() < 0 || input.text.toString().equals("")){
                signBox.text = "Error!"
            }else{
                result = Math.sqrt(input.text.toString().toDouble())
                input.text = result.toString()
            }
        }
    }

    fun btnClick_sqr(view: View) {

        if (checkOperation == false) {
            sign = "square"
            value1 = input.text.toString()
            input.text = null
            signBox.text = value1 + " ^2"
            hasPoint = false
            checkOperation = true

        } else {
            sign = "square"
            signBox.text = value1 + " ^2"
        }
    }

    fun btnClick_sin(view: View) {
        if (checkOperation == false) {
            sign = "sin"
            input.text = null
            hasPoint = false
            signBox.text = "sin"
        }
    }

    fun btnClick_cos(view: View) {
        if (checkOperation == false) {
            sign = "cos"
            input.text = null
            hasPoint = false
            signBox.text = "cos"
        }
    }

    fun btnClick_tan(view: View) {
        if (checkOperation == false) {
            sign = "tan"
            input.text = null
            hasPoint = false
            signBox.text = "tan"
        }
    }

    fun btnClick_ln(view: View) {
        if (checkOperation == false) {
            sign = "ln"
            input.text = null
            hasPoint = false
            signBox.text = "ln"
        }
    }

    fun btnClick_log(view: View) {
        if (checkOperation == false) {
            sign = "log"
            input.text = null
            hasPoint = false
            signBox.text = "log"
        }
    }

    fun btnClick_power(view: View) {
        if (checkOperation == false) {
            value1 = input.text.toString()
            sign = "npow"
            signBox.text = value1 + "^"
            input.text = null
            hasPoint = false
            checkOperation = true
        } else {
            sign = "npow"
            signBox.text = value1 + "^"

        }
    }

    fun btnClick_factorial(view: View) {
        if (checkOperation == false) {
            sign = "!"
            value1 = input.text.toString()
            hasPoint = false
            input.text = null
            checkOperation = true
            signBox.text = value1 + "!"
        } else {
            sign = "!"
            signBox.text = value1 + "!"
        }
    }

    fun btnClick_percent(view: View) {
        if (checkOperation == false) {
            sign = "%"
            value1 = input.text.toString()
            hasPoint = false
            input.text = null
            checkOperation = true
            signBox.text = "%"
        } else {
            sign = "%"
            signBox.text = "%"
        }
    }

    fun btnClick_nsqrt(view: View) {
        if (checkOperation == false) {
            sign = "nroot"
            value1 = input.text.toString()
            hasPoint = false
            input.text = null
            checkOperation = true
            signBox.text = "n based root"
        } else {
            sign = "!"
            signBox.text = "n based root"
        }
    }

    fun findFactorial(num: Int): Int {
        return if (num < 2)
            1
        else
            num * findFactorial(num - 1)
    }

    fun btnClick_equal(view: View) {
        if (sign == null) {
            signBox.text = "Error!"
        } else if (input.text == "" && sign !== "square" && sign !== "!" && sign !== "%") {
            signBox.text = "Error!"
        } else if ((sign == "+" || sign == "-" || sign == "*" || sign == "/" || sign == "square") && value1 == "") {
            signBox.text = "Error!"
        } else {
            hasPoint = true
            equalCliked = true
            when (sign) {
                "nroot" -> {
                    if(input.text.toString().equals("")) {
                        signBox.text = "Error!"
                    } else {
                        num1 = java.lang.Double.parseDouble(value1.toString())
                        value2 = input.text.toString()
                        if(input.text.toString().equals(null)){
                            input.text = "1"
                        }else{
                            num2 = java.lang.Double.parseDouble(value2.toString())
                            input.text = Math.pow(num1!!, 1 / num2!!).toString() + ""
                        }
                        signBox.text = null
                    }
                    sign = null
                    checkOperation = false
                }
                "%" -> {
                    value1 = input.text.toString()
                    if(value1.equals("")){
                        signBox.text = "Error!"
                        input.text = "0"
                    } else {
                        num1 = java.lang.Double.parseDouble(value1.toString())
                        input.text = (num1!! / 100).toString() + ""
                        sign = null
                        checkOperation = false
                        signBox.text = null
                    }
                }
                "square" -> {

                    num1 = value1?.let { java.lang.Double.parseDouble(it) }
                    result = num1!! * num1!!
                    input.text = result.toString() + ""
                    sign = null
                    signBox.text = null
                    checkOperation = false
                }
                "sin" -> {
                    value1 = input.text.toString()
                    if(value1.equals("")){
                        signBox.text = "Error!"
                        input.text = "0"
                    } else {
                        num1 = java.lang.Double.parseDouble(value1!!)
                        if (num1 == 30.0)
                            input.text = "0.5"
                        else
                            input.text = Math.sin(Math.toRadians(num1!!)).toString() + ""
                        sign = null
                        signBox.text = null
                    }
                    checkOperation = false
                }
                "cos" -> {
                    value1 = input.text.toString()
                    if(value1.equals("")){
                        signBox.text = "Error!"
                        input.text = "0"
                    } else {
                        num1 = java.lang.Double.parseDouble(value1!!)
                        if (num1 == 60.0)
                            input.text = "0.5"
                        else
                            input.text = Math.cos(Math.toRadians(num1!!)).toString() + ""
                        sign = null
                        signBox.text = null
                    }
                    checkOperation = false
                }
                "tan" -> {
                    value1 = input.text.toString()
                    if(value1.equals("")){
                        signBox.text = "Error!"
                        input.text = "0"
                    } else {
                        num1 = java.lang.Double.parseDouble(value1!!)
                        input.text = Math.tan(num1!!).toString() + ""
                        sign = null
                        signBox.text = null
                    }
                    checkOperation = false
                }
                "ln" -> {
                    value1 = input.text.toString()
                    if(input.text.toString().equals("")) {
                        signBox.text = "Error!"
                    } else {
                        if(input.text.toString().toInt() == 0) {
                            input.text = "0"
                            signBox.text = "Error!"
                        } else {
                            input.text = Math.log(value1!!.toDouble()).toString()
                            signBox.text = null
                        }
                    }
                    sign = null
                    checkOperation = false
                }
                "log" -> {
                    value1 = input.text.toString()
                    if(input.text.toString().equals("")) {
                        signBox.text = "Error!"
                    } else {
                        if(input.text.toString().toInt() == 0) {
                            input.text = "0"
                            signBox.text = "Error!"
                        } else {
                            input.text = Math.log10(value1!!.toDouble()).toString()
                            signBox.text = null
                        }
                    }
                    sign = null
                    checkOperation = false
                }
                "npow" -> {
                    if(input.text.toString().equals("")){
                        signBox.text = "Error"
                        input.text = "0"
                    } else {
                        value2 = input.text.toString()
                        num1 = java.lang.Double.parseDouble(value1.toString())
                        num2 = java.lang.Double.parseDouble(value2.toString())
                        result = Math.pow(num1!!, num2!!)
                        input.text = result!!.toString() + ""
                        checkOperation = false
                        signBox.text = null
                    }
                    sign = null
                }
                "!" -> {
                    num1 = java.lang.Double.parseDouble(value1.toString())
                    val sum = 1
                    var res = 0
                    try {
                        val n = Integer.parseInt(value1.toString())
                        res = findFactorial(n)
                        input.text = findFactorial(n).toString() + ""
                    } catch (e: NumberFormatException) {
                        input.text = value1.toString() + " is not a valid integer number"
                    }
                    checkOperation = false
                    sign = null
                    signBox.text = null
                }
                "+" -> {
                    value2 = input.text.toString()
                    num1 = java.lang.Double.parseDouble(value1.toString())
                    num2 = java.lang.Double.parseDouble(value2.toString())
                    result = num1!! + num2!!
                    input.text = result.toString() + ""
                    sign = null
                    checkOperation = false
                    signBox.text = null
                }
                "-" -> {
                    value2 = input.text.toString()
                    num1 = java.lang.Double.parseDouble(value1.toString())
                    num2 = java.lang.Double.parseDouble(value2.toString())
                    result = num1!! - num2!!
                    input.text = result.toString() + ""
                    sign = null
                    checkOperation = false

                    signBox.text = null
                }
                "*" -> {
                    value2 = input.text.toString()
                    num1 = java.lang.Double.parseDouble(value1.toString())
                    num2 = java.lang.Double.parseDouble(value2.toString())
                    result = num1!! * num2!!
                    input.text = result.toString() + ""
                    sign = null
                    checkOperation = false

                    signBox.text = null
                }
                "/" -> {
                    num1 = java.lang.Double.parseDouble(value1.toString())
                    value2 = input.text.toString()
                    num2 = java.lang.Double.parseDouble(value2.toString())
                    if (num2==0.0)
                        signBox.text = "Can't divide by zero"
                    else {
                        result = num1!! / num2!!
                        input.text = result.toString() + ""
                    }
                    checkOperation = false
                    sign = null
                }
                else -> {
                }
            }

        }
    }

    fun btnClick_dot(view: View) {
        if (!hasPoint && checkNumber) {
            if (input.text == "") {
                input.text = "0."
            } else {
                input.text = input.text.toString() + "."
            }
            hasPoint = true
        }
    }

    fun btnClick_delete(view: View) {
        if (input.text.toString().length == 1)
            input.text = "0"
        else {
            val len = input.text.length
            val s = input.text.toString()
            if (s[len - 1] == '.') {
                hasPoint = false
                input.text = input.text.subSequence(0, len - 1)
            } else
                input.text = input.text.subSequence(0, len - 1)
        }
    }

    fun btnClick_clear(view: View) {
        input.text = "0"
        signBox.text = null
        value1
        value2 = null
        sign = null
        hasPoint = false
        equalCliked = false
        checkOperation = false
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("numberInput", input.text.toString())
        outState.putString("signInput", signBox.text.toString())
        outState.putString("sign", sign)
        outState.putString("number1", value1)
        outState.putString("number2", value2)
        outState.putBoolean("equalClicked", equalCliked)
        outState.putBoolean("checkNumber", checkNumber)
        outState.putBoolean("checkOperation", checkOperation)
        outState.putBoolean("hasPoint", hasPoint)
        operation = signBox.text.toString()
        outState.putString("operation", operation)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        savedInstanceState.getString("numberInput")
        savedInstanceState.getString("number1")
        savedInstanceState.getString("number2")
        savedInstanceState.getString("checkNumber")
        savedInstanceState.getString("hasPoint")
        savedInstanceState.getString("signInput")
        savedInstanceState.getString("sign")
        savedInstanceState.getString("equalClicked")
        savedInstanceState.getString("checkOperation")
        savedInstanceState.getString("operation")

    }


}

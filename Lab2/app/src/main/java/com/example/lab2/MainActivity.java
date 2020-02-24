package com.example.lab2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView input, signBox;

    String sign, value1, value2;
    Double num1, num2, result;
    boolean hasDot;
    boolean lastOp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (TextView) findViewById(R.id.input);
        signBox = (TextView) findViewById(R.id.sign);

        hasDot = false;
        lastOp = false;

        if(savedInstanceState != null){
            String firstVal, val1, val2, op;
            boolean dot;
            input.setText(savedInstanceState.getString("firstVal"));
            value1 = savedInstanceState.getString("val1");
            value2 = savedInstanceState.getString("val2");
            sign = savedInstanceState.getString("op");
            hasDot = savedInstanceState.getBoolean("dot");
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("firstVal", input.getText().toString());
        outState.putString("op", sign);
        outState.putString("val1", value1);
        outState.putString("val2", value2);
        outState.putBoolean("dot", hasDot);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        savedInstanceState.getString("FirstVal");
        savedInstanceState.getString("val11");
        savedInstanceState.getBoolean("dot");
        savedInstanceState.getString("val2");
        savedInstanceState.getString("op");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_0(View view) {
        String s = input.getText().toString();
        if(s.equals("0")){
            input.setText("0");
        }else{
            signBox.setText(null);
            input.setText(input.getText() + "0");
        }
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_1(View view) {
        String s = input.getText().toString();
        if(s.equals("0")){
            input.setText("1");
        }else{
            signBox.setText(null);
            input.setText(input.getText() + "1");
        }
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_2(View view) {
        String s = input.getText().toString();
        if(s.equals("0")){
            input.setText("2");
        }else{
            signBox.setText(null);
            input.setText(input.getText() + "2");
        }
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_3(View view) {
        String s = input.getText().toString();
        if(s.equals("0")){
            input.setText("3");
        }else{
            signBox.setText(null);
            input.setText(input.getText() + "3");
        }
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_4(View view) {
        String s = input.getText().toString();
        if(s.equals("0")){
            input.setText("4");
        }else{
            signBox.setText(null);
            input.setText(input.getText() + "4");
        }
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_5(View view) {
        String s = input.getText().toString();
        if(s.equals("0")){
            input.setText("5");
        }else{
            signBox.setText(null);
            input.setText(input.getText() + "5");
        }
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_6(View view) {
        String s = input.getText().toString();
        if(s.equals("0")){
            input.setText("6");
        }else{
            signBox.setText(null);
            input.setText(input.getText() + "6");
        }
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_7(View view) {
        String s = input.getText().toString();
        if(s.equals("0")){
            input.setText("7");
        }else{
            signBox.setText(null);
            input.setText(input.getText() + "7");
        }
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_8(View view) {
        String s = input.getText().toString();
        if(s.equals("0")){
            input.setText("8");
        }else{
            signBox.setText(null);
            input.setText(input.getText() + "8");
        }
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_9(View view) {
        String s = input.getText().toString();
        if(s.equals("0")){
            input.setText("9");
        }else{
            signBox.setText(null);
            input.setText(input.getText() + "9");
        }
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_dot(View view) {
        if (!hasDot) {
            if (input.getText().toString().equals("")) {
                input.setText("0.");
            } else {
                input.setText(input.getText() + ".");
            }
            hasDot = true;
        }
    }

    public void btnClick_root(View view) {
        if (input.getText().toString().equals("0")) {
            input.setText("0");
        } else {
            double num = Double.parseDouble(input.getText().toString());
            if (num < 0) {
                signBox.setText("Error!");
            } else {
                result = Math.sqrt(num);
                input.setText(result + "");
                result = null;
            }
        }
    }

    public void btnClick_sqr(View view) {
        sign = "sqr";
        value1 = input.getText().toString();
        hasDot = false;
        signBox.setText("^2");
        input.setText(Math.pow(Double.parseDouble(value1), 2) + "");
    }

    public void btnClick_power(View view){
        sign = "power";
        value1 = input.getText().toString();
        hasDot = false;
        signBox.setText("n^m");
        input.setText(null);
    }

    public void btnClick_add(View view) {
        if(lastOp == false) {
            sign = "+";
            value1 = input.getText().toString();
            input.setText(null);
            signBox.setText("+");
            lastOp = true;
            hasDot = false;
        }
        else {
            sign = "+";
            signBox.setText("+");
        }
    }

    public void btnClick_subtract(View view) {
        if(lastOp == false){
            sign = "-";
            value1 = input.getText().toString();
            input.setText(null);
            signBox.setText("-");
            hasDot = false;
            lastOp = true;
        }else{
            sign = "-";
            signBox.setText("-");
        }
    }

    public void btnClick_multiply(View view) {
        if(lastOp == false){
            sign = "*";
            value1 = input.getText().toString();
            input.setText(null);
            signBox.setText("×");
            hasDot = false;
            lastOp = true;
        }else{
            sign = "*";
            signBox.setText("×");
        }
    }

    public void btnClick_divide(View view) {
        if (lastOp == false){
            sign = "/";
            value1 = input.getText().toString();
            input.setText(null);
            signBox.setText("÷");
            hasDot = false;
            lastOp = true;
        }else{
            sign = "/";
            signBox.setText("÷");
        }
    }

    public void btnClick_factorial(View view) {
        sign = "factorial";
        hasDot = false;
        signBox.setText("!");
        value1 = input.getText().toString();
        num1 = Double.parseDouble(value1);
        double ans = 1;
        for (int i = 1; i <= num1; i ++){
            ans = ans*i;
        }
        input.setText(ans + "");
    }

    public void btnClick_percent(View view){
        sign = "percent";
        signBox.setText("%");
        hasDot = false;
        input.setText(Double.parseDouble(input.getText().toString())/100 + "");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_nsqrt(View view){
        sign = "nsqrt";
        value1 = input.getText().toString();
        hasDot = false;
        signBox.setText("n(sqrt)");
        input.setText(null);
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_sin(View view) {
        sign = "sin";
        input.setText(null);
        hasDot = false;
        signBox.setText("sin");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_cos(View view) {
        sign = "cos";
        input.setText(null);
        hasDot = false;
        signBox.setText("cos");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_tan(View view) {
        sign = "tan";
        input.setText(null);
        hasDot = false;
        signBox.setText("tan");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_log(View view) {
        sign = "log";
        input.setText(null);
        signBox.setText("log");
        hasDot = false;
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_ln(View view) {
        sign = "ln";
        input.setText(null);
        signBox.setText("ln");
        hasDot = false;
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_equal(View view) {
        if (sign == null) {
            signBox.setText("Error!");
        }else if (signBox.getText().toString().equals("Error!")){
            signBox.setText(null);
            input.setText("0");
        }else if (input.getText().equals("")) {
            signBox.setText("Error!");
        } else if ((sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) && value1.equals("")) {
            signBox.setText("Error!");
        } else {
            switch (sign) {
                default:
                    break;
                case "+":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 + num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    hasDot = true;
                    lastOp = false;
                    break;
                case "-":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 - num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    hasDot = true;
                    lastOp = false;
                    break;
                case "*":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 * num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    hasDot = true;
                    lastOp = false;
                    break;
                case "/":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 / num2;
                    lastOp = false;
                    if(num2 == 0){
                        input.setText(null);
                        signBox.setText("Cant divide by 0!");
                        hasDot = false;
                    }else{
                        input.setText(result + "");
                        sign = null;
                        signBox.setText(null);
                        hasDot = true;
                    }
                    break;
                case "power":
                    if(input.getText().toString().equals("")){
                        signBox.setText("Error!");
                    }else {
                        value2 = input.getText().toString();
                        num1 = Double.parseDouble(value1);
                        num2 = Double.parseDouble(value2);
                        result = Math.pow(num1, num2);
                        String str2 = Double.toString(result);
                        if(str2.equals("Infinity")){
                            str2 = "0";
                        }
                        input.setText(str2);
                        signBox.setText(null);
                        lastOp = false;
                    }
                    sign = null;
                    hasDot = true;
                    break;
                case "sin":
                    value1 = input.getText().toString();
                    if(input.getText().toString().equals("")){
                        signBox.setText("Error!");
                    }else{
                        num1 = Double.parseDouble((value1));
                        input.setText(Math.sin(num1) + "");
                        signBox.setText(null);
                    }
                    sign = null;
                    hasDot = true;
                    break;
                case "cos":
                    value1 = input.getText().toString();
                    if(input.getText().toString().equals("")){
                        signBox.setText("Error!");
                    }else {
                        num1 = Double.parseDouble((value1));
                        input.setText(Math.cos(num1) + "");
                        signBox.setText(null);
                    }
                    sign = null;
                    hasDot = true;
                    break;
                case "tan":
                    if(input.getText().toString().equals("")){
                        signBox.setText("Error!");
                    }else {
                        value1 = input.getText().toString();
                        num1 = Double.parseDouble((value1));
                        input.setText(Math.tan(num1) + "");
                        signBox.setText(null);
                    }
                    sign = null;
                    hasDot = true;
                    break;
                case "log":
                    value1 = input.getText().toString();
                    if(input.getText().toString().equals("")){
                        signBox.setText("Error!");
                    }else {
                        num1 = Double.parseDouble(value1);
                        if(num1 == 0){
                            signBox.setText("Error");
                        }else{
                            input.setText(Math.log10(num1) + "");
                            signBox.setText(null);
                        }
                    }
                    sign = null;
                    hasDot = true;
                    break;
                case "ln":
                    value1 = input.getText().toString();
                    if(input.getText().toString().equals("")){
                        signBox.setText("Error!");
                    }else {
                        num1 = Double.parseDouble(value1);
                        if(num1 == 0){
                            signBox.setText("Error");
                        }else{
                            input.setText(Math.log(num1) + "");
                            signBox.setText(null);
                        }
                    }
                    sign = null;
                    hasDot = true;
                    break;
                case "nsqrt":
                    if(input.getText().toString().equals("")){
                        signBox.setText("Error!");
                    }else{
                        num1 = Double.parseDouble(value1);
                        value2 = input.getText().toString();
                        num2 = Double.parseDouble(value2);
                        input.setText(Math.round(Math.pow(num2, 1/num1)*1000.0)/1000.0 + "");
                        signBox.setText(null);
                        hasDot = true;
                    }
                    sign = null;
                    break;
            }
        }
    }
    public void btnClick_delete(View view) {
        if (input.getText().toString().equals("0")) {
            input.setText("0");
            signBox.setText(null);
        } else if(input.getText().toString().equals("")){
            input.setText("0");
        }else {
            String newStr = input.getText().toString();
            int len = input.getText().length();
            String s = newStr.substring(0, len - 1);
            input.setText(s + "");
        }
    }

    public void btnClick_clear(View view) {
        input.setText("0");
        signBox.setText(null);
        value1 = null;
        value2 = null;
        sign = null;
        hasDot = false;
        lastOp = false;
    }
}
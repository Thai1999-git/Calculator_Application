package vn.hust.edu.calculatorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, enter, add, sub, mul, div, ce, c, bs,change;
    TextView txt1;
    int var1;
    int var2;
    int ans;
    Boolean addition = false, subtract = false, multiply = false, divide = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*EditText font = (EditText) findViewById(R.id.text1);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "font/dsdigib.TTF");
        font.setTypeface(typeface);*/

        b1 = findViewById(R.id.one);
        b2 = findViewById(R.id.two);
        b3 = findViewById(R.id.three);
        b4 = findViewById(R.id.four);
        b5 = findViewById(R.id.five);
        b6 = findViewById(R.id.six);
        b7 = findViewById(R.id.seven);
        b8 = findViewById(R.id.eight);
        b9 = findViewById(R.id.nine);
        b0 = findViewById(R.id.zero);
        enter = findViewById(R.id.enter);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        ce = findViewById(R.id.ce);
        c = findViewById(R.id.c);
        bs = findViewById(R.id.bs);
        change = findViewById(R.id.change);
        txt1 = findViewById(R.id.text1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText() + "6");
            }
        });
        //to show value of this button in textView1
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText() + "0");
            }
        });

        //phep cong
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                colorChange(add);
                buttonFalse();
                addition = true;
            }
        });

        //phep tru
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                colorChange(sub);
                buttonFalse();
                subtract = true;
            }
        });

        //phep nhan
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                colorChange(mul);
                buttonFalse();
                multiply = true;
            }
        });

        //phep chia
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                colorChange(div);
                buttonFalse();
                divide = true;
            }
        });

        //xoa chu so hang don vi

        //xoa toan hang hien tai

        //xoa phep tinh
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allReset();
            }
        });

        //ket qua phep tinh
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var2 = Integer.parseInt(txt1.getText().toString());
                if (addition) {
                    ans = var1 + var2;
                } else if (subtract) {
                    ans = var1 - var2;
                } else if (multiply) {
                    ans = var1 * var2;
                } else if (divide) {
                    ans = var1 / var2;
                } else {
                    ans = ans + 0;
                }
            }
        });
    }

    public void buttonFalse()
    {
        sub.setEnabled(false);
        mul.setEnabled(false);
        div.setEnabled(false);
        add.setEnabled(false);
        txt1.setText("");
    }

    public void setVar1(){
        var1 = Integer.parseInt(txt1.getText().toString());
    }

    public void allReset()
    {
        /*add.setBackgroundColor(getResources().getColor(R.color.buttonColor));
        mul.setBackgroundColor(getResources().getColor(R.color.buttonColor));
        sub.setBackgroundColor(getResources().getColor(R.color.buttonColor));
        div.setBackgroundColor(getResources().getColor(R.color.buttonColor));*/

        enter.setEnabled(true);
        sub.setEnabled(true);
        mul.setEnabled(true);
        div.setEnabled(true);
        add.setEnabled(true);
        txt1.setText("");
    }

    public void colorChange(Button b){
        b.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
    }
}

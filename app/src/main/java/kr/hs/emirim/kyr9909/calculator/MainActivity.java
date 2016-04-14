/* -Event Res
   -Event Listener
        Click             1, Edit Text 에 입력된 값 반환 -> 정수
                          2, 연산(사칙)
           -> 처리내용:     3, TextView에 설정
   -Event Handler
 */

package kr.hs.emirim.kyr9909.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    Button butPlus, butMinus, butDivide, butMultiply;
    EditText editNum1, editNum2;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // layout 에 저장했던 요소들이 들어있는 메서드
        butPlus=(Button)findViewById(R.id.but_plus);
        butMinus=(Button)findViewById(R.id.but_minus);
        butDivide=(Button)findViewById(R.id.but_divide);
        butMultiply=(Button)findViewById(R.id.but_multiply);
        editNum1=(EditText)findViewById(R.id.edit_num1);
        editNum2=(EditText)findViewById(R.id.edit_num2);
        textResult=(TextView)findViewById(R.id.text_result);
        butPlus.setOnClickListener(this);
        butMinus.setOnClickListener(this);
        butDivide.setOnClickListener(this);
        butMultiply.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // 2개위 EditText에 입력된 값을 반환받는다.
        String num1Str=editNum1.getText().toString();
        String num2Str=editNum2.getText().toString();
        int num1=Integer.parseInt(num1Str);
        int num2=Integer.parseInt(num2Str);
        double result=0;

        switch (v.getId()){
            case R.id.but_plus:
                result = num1+num2; break;
            case R.id.but_minus:
                result = num1-num2; break;
            case R.id.but_divide:
                result = (double)num1/num2; break;
            case R.id.but_multiply:
                result = num1*num2; break;

        }
        textResult.setText("* 계산 결과 : "+result);

    }
}

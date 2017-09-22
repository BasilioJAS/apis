package ar.com.basilium.apis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//import ar.com.basilium.apis.fabric.answersInterface;
//import ar.com.basilium.apis.fabric.fabricInterface;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import fabri
public class MainActivity extends AppCompatActivity {

    CallbackManager callbackManager ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        final Fabric fabric = new Fabric.Builder(this).kits(new Crashlytics()).debuggable(true).build();
  //      Fabric.with(fabric);
     //   FacebookSdk.setApplicationId("788314874659500");
      //  FacebookSdk.sdkInitialize(getApplicationContext());

        fabricInterface.getInstance().init(this, false);

      //  setContentView(R.layout.activity_main);


        answersInterface.getInstance().logContentView();
        answersInterface.getInstance().logKeyMetric();
        fabricInterface.getInstance().logUser();
        //fabricInterface.getInstance().testCrash();


        super.onCreate(savedInstanceState);

        callbackManager = CallbackManager.Factory.create();

        LoginManager.getInstance().registerCallback(callbackManager,
                new FacebookCallback<LoginResult>() {
                    @Override
                    public void onSuccess(LoginResult loginResult) {
                        // App code
                    }

                    @Override
                    public void onCancel() {
                        // App code
                    }

                    @Override
                    public void onError(FacebookException exception) {
                        // App code
                    }
                });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }

    public int test_de_test()
    {
        return 4;
    }
}

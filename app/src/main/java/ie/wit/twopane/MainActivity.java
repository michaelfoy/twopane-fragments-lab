package ie.wit.twopane;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  ActionBar actionBar;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.fragment_2);

    actionBar = getSupportActionBar();

    FragmentManager manager = getSupportFragmentManager();
    Fragment fragment = manager.findFragmentById(R.id.detailFragmentContainer);
    if (fragment == null)
    {
      fragment = new Fragment_1();
      manager.beginTransaction().add(R.id.detailFragmentContainer, fragment).commit();
    }
  }
}
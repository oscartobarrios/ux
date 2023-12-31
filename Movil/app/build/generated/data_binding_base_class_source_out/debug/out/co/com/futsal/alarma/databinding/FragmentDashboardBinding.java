// Generated by view binder compiler. Do not edit!
package co.com.futsal.alarma.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import co.com.futsal.alarma.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDashboardBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button3;

  @NonNull
  public final Button button4;

  @NonNull
  public final EditText editTextTextMultiLine2;

  @NonNull
  public final EditText editTextTime2;

  @NonNull
  public final EditText editTextTime3;

  @NonNull
  public final ImageButton horamas;

  @NonNull
  public final ImageButton horamenos;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final ImageButton minmas;

  @NonNull
  public final ImageButton minmenos;

  @NonNull
  public final TextView textDashboard;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  private FragmentDashboardBinding(@NonNull ConstraintLayout rootView, @NonNull Button button3,
      @NonNull Button button4, @NonNull EditText editTextTextMultiLine2,
      @NonNull EditText editTextTime2, @NonNull EditText editTextTime3,
      @NonNull ImageButton horamas, @NonNull ImageButton horamenos, @NonNull ImageView imageView3,
      @NonNull ImageView imageView4, @NonNull ImageButton minmas, @NonNull ImageButton minmenos,
      @NonNull TextView textDashboard, @NonNull TextView textView6, @NonNull TextView textView7) {
    this.rootView = rootView;
    this.button3 = button3;
    this.button4 = button4;
    this.editTextTextMultiLine2 = editTextTextMultiLine2;
    this.editTextTime2 = editTextTime2;
    this.editTextTime3 = editTextTime3;
    this.horamas = horamas;
    this.horamenos = horamenos;
    this.imageView3 = imageView3;
    this.imageView4 = imageView4;
    this.minmas = minmas;
    this.minmenos = minmenos;
    this.textDashboard = textDashboard;
    this.textView6 = textView6;
    this.textView7 = textView7;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDashboardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_dashboard, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDashboardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button3;
      Button button3 = ViewBindings.findChildViewById(rootView, id);
      if (button3 == null) {
        break missingId;
      }

      id = R.id.button4;
      Button button4 = ViewBindings.findChildViewById(rootView, id);
      if (button4 == null) {
        break missingId;
      }

      id = R.id.editTextTextMultiLine2;
      EditText editTextTextMultiLine2 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextMultiLine2 == null) {
        break missingId;
      }

      id = R.id.editTextTime2;
      EditText editTextTime2 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTime2 == null) {
        break missingId;
      }

      id = R.id.editTextTime3;
      EditText editTextTime3 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTime3 == null) {
        break missingId;
      }

      id = R.id.horamas;
      ImageButton horamas = ViewBindings.findChildViewById(rootView, id);
      if (horamas == null) {
        break missingId;
      }

      id = R.id.horamenos;
      ImageButton horamenos = ViewBindings.findChildViewById(rootView, id);
      if (horamenos == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.minmas;
      ImageButton minmas = ViewBindings.findChildViewById(rootView, id);
      if (minmas == null) {
        break missingId;
      }

      id = R.id.minmenos;
      ImageButton minmenos = ViewBindings.findChildViewById(rootView, id);
      if (minmenos == null) {
        break missingId;
      }

      id = R.id.text_dashboard;
      TextView textDashboard = ViewBindings.findChildViewById(rootView, id);
      if (textDashboard == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      return new FragmentDashboardBinding((ConstraintLayout) rootView, button3, button4,
          editTextTextMultiLine2, editTextTime2, editTextTime3, horamas, horamenos, imageView3,
          imageView4, minmas, minmenos, textDashboard, textView6, textView7);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

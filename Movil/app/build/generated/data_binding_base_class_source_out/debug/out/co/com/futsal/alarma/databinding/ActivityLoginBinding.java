// Generated by view binder compiler. Do not edit!
package co.com.futsal.alarma.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import co.com.futsal.alarma.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-w1240dp/</li>
   *   <li>layout-w936dp/</li>
   * </ul>
   */
  @Nullable
  public final Barrier barrier2;

  @NonNull
  public final ConstraintLayout container;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-w1240dp/</li>
   *   <li>layout-w936dp/</li>
   * </ul>
   */
  @Nullable
  public final ImageView imageView;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-w1240dp/</li>
   *   <li>layout-w936dp/</li>
   * </ul>
   */
  @Nullable
  public final ImageView imageView2;

  @NonNull
  public final ProgressBar loading;

  @NonNull
  public final Button login;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-w1240dp/</li>
   *   <li>layout-w936dp/</li>
   * </ul>
   */
  @Nullable
  public final Button login2;

  @NonNull
  public final EditText password;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-w1240dp/</li>
   *   <li>layout-w936dp/</li>
   * </ul>
   */
  @Nullable
  public final TextView textView;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-w1240dp/</li>
   *   <li>layout-w936dp/</li>
   * </ul>
   */
  @Nullable
  public final TextView textView2;

  @NonNull
  public final EditText username;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @Nullable Barrier barrier2,
      @NonNull ConstraintLayout container, @Nullable ImageView imageView,
      @Nullable ImageView imageView2, @NonNull ProgressBar loading, @NonNull Button login,
      @Nullable Button login2, @NonNull EditText password, @Nullable TextView textView,
      @Nullable TextView textView2, @NonNull EditText username) {
    this.rootView = rootView;
    this.barrier2 = barrier2;
    this.container = container;
    this.imageView = imageView;
    this.imageView2 = imageView2;
    this.loading = loading;
    this.login = login;
    this.login2 = login2;
    this.password = password;
    this.textView = textView;
    this.textView2 = textView2;
    this.username = username;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.barrier2;
      Barrier barrier2 = ViewBindings.findChildViewById(rootView, id);

      ConstraintLayout container = (ConstraintLayout) rootView;

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);

      id = R.id.loading;
      ProgressBar loading = ViewBindings.findChildViewById(rootView, id);
      if (loading == null) {
        break missingId;
      }

      id = R.id.login;
      Button login = ViewBindings.findChildViewById(rootView, id);
      if (login == null) {
        break missingId;
      }

      id = R.id.login2;
      Button login2 = ViewBindings.findChildViewById(rootView, id);

      id = R.id.password;
      EditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);

      id = R.id.username;
      EditText username = ViewBindings.findChildViewById(rootView, id);
      if (username == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, barrier2, container, imageView,
          imageView2, loading, login, login2, password, textView, textView2, username);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
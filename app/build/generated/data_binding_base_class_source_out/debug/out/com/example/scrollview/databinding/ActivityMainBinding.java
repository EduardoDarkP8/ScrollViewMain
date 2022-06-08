// Generated by view binder compiler. Do not edit!
package com.example.scrollview.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.scrollview.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnAmigos2;

  @NonNull
  public final Button btnDescri;

  @NonNull
  public final Button btnDivulgacao;

  @NonNull
  public final Button btnNome;

  @NonNull
  public final Button btnTimeLine;

  @NonNull
  public final TextView tvDescricao;

  @NonNull
  public final TextView tvNome;

  @NonNull
  public final EditText txtDescri;

  @NonNull
  public final EditText txtName;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnAmigos2,
      @NonNull Button btnDescri, @NonNull Button btnDivulgacao, @NonNull Button btnNome,
      @NonNull Button btnTimeLine, @NonNull TextView tvDescricao, @NonNull TextView tvNome,
      @NonNull EditText txtDescri, @NonNull EditText txtName) {
    this.rootView = rootView;
    this.btnAmigos2 = btnAmigos2;
    this.btnDescri = btnDescri;
    this.btnDivulgacao = btnDivulgacao;
    this.btnNome = btnNome;
    this.btnTimeLine = btnTimeLine;
    this.tvDescricao = tvDescricao;
    this.tvNome = tvNome;
    this.txtDescri = txtDescri;
    this.txtName = txtName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnAmigos2;
      Button btnAmigos2 = ViewBindings.findChildViewById(rootView, id);
      if (btnAmigos2 == null) {
        break missingId;
      }

      id = R.id.btnDescri;
      Button btnDescri = ViewBindings.findChildViewById(rootView, id);
      if (btnDescri == null) {
        break missingId;
      }

      id = R.id.btnDivulgacao;
      Button btnDivulgacao = ViewBindings.findChildViewById(rootView, id);
      if (btnDivulgacao == null) {
        break missingId;
      }

      id = R.id.btnNome;
      Button btnNome = ViewBindings.findChildViewById(rootView, id);
      if (btnNome == null) {
        break missingId;
      }

      id = R.id.btnTimeLine;
      Button btnTimeLine = ViewBindings.findChildViewById(rootView, id);
      if (btnTimeLine == null) {
        break missingId;
      }

      id = R.id.tvDescricao;
      TextView tvDescricao = ViewBindings.findChildViewById(rootView, id);
      if (tvDescricao == null) {
        break missingId;
      }

      id = R.id.tvNome;
      TextView tvNome = ViewBindings.findChildViewById(rootView, id);
      if (tvNome == null) {
        break missingId;
      }

      id = R.id.txtDescri;
      EditText txtDescri = ViewBindings.findChildViewById(rootView, id);
      if (txtDescri == null) {
        break missingId;
      }

      id = R.id.txtName;
      EditText txtName = ViewBindings.findChildViewById(rootView, id);
      if (txtName == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, btnAmigos2, btnDescri,
          btnDivulgacao, btnNome, btnTimeLine, tvDescricao, tvNome, txtDescri, txtName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
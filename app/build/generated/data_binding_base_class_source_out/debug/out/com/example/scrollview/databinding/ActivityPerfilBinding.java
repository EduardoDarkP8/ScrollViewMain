// Generated by view binder compiler. Do not edit!
package com.example.scrollview.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
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

public final class ActivityPerfilBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView ImgPerfil;

  @NonNull
  public final TextView TextNome;

  @NonNull
  public final Switch Troca;

  @NonNull
  public final Button btnDivulgacaoPerfil;

  @NonNull
  public final TextView txtDescriPerfil;

  private ActivityPerfilBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView ImgPerfil,
      @NonNull TextView TextNome, @NonNull Switch Troca, @NonNull Button btnDivulgacaoPerfil,
      @NonNull TextView txtDescriPerfil) {
    this.rootView = rootView;
    this.ImgPerfil = ImgPerfil;
    this.TextNome = TextNome;
    this.Troca = Troca;
    this.btnDivulgacaoPerfil = btnDivulgacaoPerfil;
    this.txtDescriPerfil = txtDescriPerfil;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPerfilBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPerfilBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_perfil, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPerfilBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ImgPerfil;
      ImageView ImgPerfil = ViewBindings.findChildViewById(rootView, id);
      if (ImgPerfil == null) {
        break missingId;
      }

      id = R.id.TextNome;
      TextView TextNome = ViewBindings.findChildViewById(rootView, id);
      if (TextNome == null) {
        break missingId;
      }

      id = R.id.Troca;
      Switch Troca = ViewBindings.findChildViewById(rootView, id);
      if (Troca == null) {
        break missingId;
      }

      id = R.id.btnDivulgacaoPerfil;
      Button btnDivulgacaoPerfil = ViewBindings.findChildViewById(rootView, id);
      if (btnDivulgacaoPerfil == null) {
        break missingId;
      }

      id = R.id.txtDescriPerfil;
      TextView txtDescriPerfil = ViewBindings.findChildViewById(rootView, id);
      if (txtDescriPerfil == null) {
        break missingId;
      }

      return new ActivityPerfilBinding((ConstraintLayout) rootView, ImgPerfil, TextNome, Troca,
          btnDivulgacaoPerfil, txtDescriPerfil);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

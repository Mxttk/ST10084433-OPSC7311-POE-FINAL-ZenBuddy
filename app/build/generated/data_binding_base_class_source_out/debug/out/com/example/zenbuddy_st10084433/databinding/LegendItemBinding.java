// Generated by view binder compiler. Do not edit!
package com.example.zenbuddy_st10084433.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.zenbuddy_st10084433.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LegendItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final View legendEntryColor;

  @NonNull
  public final TextView legendEntryLabel;

  private LegendItemBinding(@NonNull LinearLayout rootView, @NonNull View legendEntryColor,
      @NonNull TextView legendEntryLabel) {
    this.rootView = rootView;
    this.legendEntryColor = legendEntryColor;
    this.legendEntryLabel = legendEntryLabel;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LegendItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LegendItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.legend_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LegendItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.legendEntryColor;
      View legendEntryColor = ViewBindings.findChildViewById(rootView, id);
      if (legendEntryColor == null) {
        break missingId;
      }

      id = R.id.legendEntryLabel;
      TextView legendEntryLabel = ViewBindings.findChildViewById(rootView, id);
      if (legendEntryLabel == null) {
        break missingId;
      }

      return new LegendItemBinding((LinearLayout) rootView, legendEntryColor, legendEntryLabel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

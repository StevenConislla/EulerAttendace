// Generated code from Butter Knife. Do not modify!
package com.plug.eulerattendance;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SalidaActivity_ViewBinding implements Unbinder {
  private SalidaActivity target;

  private View view2131755216;

  private View view2131755219;

  @UiThread
  public SalidaActivity_ViewBinding(SalidaActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SalidaActivity_ViewBinding(final SalidaActivity target, View source) {
    this.target = target;

    View view;
    target.txtResult = Utils.findRequiredViewAsType(source, R.id.txtResult, "field 'txtResult'", TextView.class);
    view = Utils.findRequiredView(source, R.id.btnScanEntra, "method 'onViewClicked'");
    view2131755216 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btnMenuPrincipal, "method 'onViewClicked'");
    view2131755219 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    SalidaActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtResult = null;

    view2131755216.setOnClickListener(null);
    view2131755216 = null;
    view2131755219.setOnClickListener(null);
    view2131755219 = null;
  }
}

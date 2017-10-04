// Generated code from Butter Knife. Do not modify!
package com.plug.eulerattendance;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ListaActivity_ViewBinding implements Unbinder {
  private ListaActivity target;

  private View view2131755219;

  private View view2131755220;

  @UiThread
  public ListaActivity_ViewBinding(ListaActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ListaActivity_ViewBinding(final ListaActivity target, View source) {
    this.target = target;

    View view;
    target.rvDatos = Utils.findRequiredViewAsType(source, R.id.rvDatos, "field 'rvDatos'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.btnMenuPrincipal, "method 'onViewClicked'");
    view2131755219 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.btnEliminarRegistro, "method 'onViewClicked3'");
    view2131755220 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked3();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ListaActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvDatos = null;

    view2131755219.setOnClickListener(null);
    view2131755219 = null;
    view2131755220.setOnClickListener(null);
    view2131755220 = null;
  }
}

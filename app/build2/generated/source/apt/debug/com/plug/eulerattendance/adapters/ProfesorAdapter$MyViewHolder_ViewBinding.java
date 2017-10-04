// Generated code from Butter Knife. Do not modify!
package com.plug.eulerattendance.adapters;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.plug.eulerattendance.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ProfesorAdapter$MyViewHolder_ViewBinding implements Unbinder {
  private ProfesorAdapter.MyViewHolder target;

  @UiThread
  public ProfesorAdapter$MyViewHolder_ViewBinding(ProfesorAdapter.MyViewHolder target,
      View source) {
    this.target = target;

    target.tvDia = Utils.findRequiredViewAsType(source, R.id.tvDia, "field 'tvDia'", TextView.class);
    target.tvNombre = Utils.findRequiredViewAsType(source, R.id.tvNombre, "field 'tvNombre'", TextView.class);
    target.tvHora = Utils.findRequiredViewAsType(source, R.id.tvHora, "field 'tvHora'", TextView.class);
    target.tvFechaExacta = Utils.findRequiredViewAsType(source, R.id.tvFechaExacta, "field 'tvFechaExacta'", TextView.class);
    target.contenedorPersonal = Utils.findRequiredViewAsType(source, R.id.contenedorPersonal, "field 'contenedorPersonal'", CardView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ProfesorAdapter.MyViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvDia = null;
    target.tvNombre = null;
    target.tvHora = null;
    target.tvFechaExacta = null;
    target.contenedorPersonal = null;
  }
}

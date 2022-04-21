package androidx.constraintlayout.widget;

/* renamed from: androidx.constraintlayout.widget.e */
/* loaded from: classes.dex */
public class C0671e extends android.view.View {
    public C0671e(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 8
            super.setVisibility(r1)
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r1, int r2) {
            r0 = this;
            r1 = 0
            r0.setMeasuredDimension(r1, r1)
            return
    }

    public void setGuidelineBegin(int r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r0 = (androidx.constraintlayout.widget.ConstraintLayout.C0662a) r0
            r0.f2426a = r2
            r1.setLayoutParams(r0)
            return
    }

    public void setGuidelineEnd(int r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r0 = (androidx.constraintlayout.widget.ConstraintLayout.C0662a) r0
            r0.f2428b = r2
            r1.setLayoutParams(r0)
            return
    }

    public void setGuidelinePercent(float r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r0 = (androidx.constraintlayout.widget.ConstraintLayout.C0662a) r0
            r0.f2430c = r2
            r1.setLayoutParams(r0)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r1) {
            r0 = this;
            return
    }
}

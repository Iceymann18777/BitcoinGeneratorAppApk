package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.i */
/* loaded from: classes.dex */
class C0604i {

    /* renamed from: a */
    private final android.widget.CompoundButton f2169a;

    /* renamed from: b */
    private android.content.res.ColorStateList f2170b;

    /* renamed from: c */
    private android.graphics.PorterDuff.Mode f2171c;

    /* renamed from: d */
    private boolean f2172d;

    /* renamed from: e */
    private boolean f2173e;

    /* renamed from: f */
    private boolean f2174f;

    C0604i(android.widget.CompoundButton r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f2170b = r0
            r1.f2171c = r0
            r0 = 0
            r1.f2172d = r0
            r1.f2173e = r0
            r1.f2169a = r2
            return
    }

    /* renamed from: a */
    int m2020a(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 >= r1) goto L_0x0013
            android.widget.CompoundButton r0 = r2.f2169a
            android.graphics.drawable.Drawable r0 = androidx.core.widget.C0714c.m1512a(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getIntrinsicWidth()
            int r3 = r3 + r0
        L_0x0013:
            return r3
    }

    /* renamed from: a */
    void m2021a() {
            r2 = this;
            android.widget.CompoundButton r0 = r2.f2169a
            android.graphics.drawable.Drawable r0 = androidx.core.widget.C0714c.m1512a(r0)
            if (r0 == 0) goto L_0x003e
            boolean r1 = r2.f2172d
            if (r1 != 0) goto L_0x0010
            boolean r1 = r2.f2173e
            if (r1 == 0) goto L_0x003e
        L_0x0010:
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.C0698a.m1591h(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            boolean r1 = r2.f2172d
            if (r1 == 0) goto L_0x0021
            android.content.res.ColorStateList r1 = r2.f2170b
            androidx.core.graphics.drawable.C0698a.m1603a(r0, r1)
        L_0x0021:
            boolean r1 = r2.f2173e
            if (r1 == 0) goto L_0x002a
            android.graphics.PorterDuff$Mode r1 = r2.f2171c
            androidx.core.graphics.drawable.C0698a.m1600a(r0, r1)
        L_0x002a:
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L_0x0039
            android.widget.CompoundButton r1 = r2.f2169a
            int[] r1 = r1.getDrawableState()
            r0.setState(r1)
        L_0x0039:
            android.widget.CompoundButton r1 = r2.f2169a
            r1.setButtonDrawable(r0)
        L_0x003e:
            return
    }

    /* renamed from: a */
    void m2019a(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.f2170b = r1
            r1 = 1
            r0.f2172d = r1
            r0.m2021a()
            return
    }

    /* renamed from: a */
    void m2018a(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.f2171c = r1
            r1 = 1
            r0.f2173e = r1
            r0.m2021a()
            return
    }

    /* renamed from: a */
    void m2017a(android.util.AttributeSet r4, int r5) {
            r3 = this;
            android.widget.CompoundButton r0 = r3.f2169a
            android.content.Context r0 = r0.getContext()
            int[] r1 = p000a.p001a.C0009j.CompoundButton
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            int r5 = p000a.p001a.C0009j.CompoundButton_android_button     // Catch: all -> 0x005c
            boolean r5 = r4.hasValue(r5)     // Catch: all -> 0x005c
            if (r5 == 0) goto L_0x002c
            int r5 = p000a.p001a.C0009j.CompoundButton_android_button     // Catch: all -> 0x005c
            int r5 = r4.getResourceId(r5, r2)     // Catch: all -> 0x005c
            if (r5 == 0) goto L_0x002c
            android.widget.CompoundButton r0 = r3.f2169a     // Catch: all -> 0x005c
            android.widget.CompoundButton r1 = r3.f2169a     // Catch: all -> 0x005c
            android.content.Context r1 = r1.getContext()     // Catch: all -> 0x005c
            android.graphics.drawable.Drawable r5 = p000a.p001a.p002k.p003a.C0010a.m4259c(r1, r5)     // Catch: all -> 0x005c
            r0.setButtonDrawable(r5)     // Catch: all -> 0x005c
        L_0x002c:
            int r5 = p000a.p001a.C0009j.CompoundButton_buttonTint     // Catch: all -> 0x005c
            boolean r5 = r4.hasValue(r5)     // Catch: all -> 0x005c
            if (r5 == 0) goto L_0x003f
            android.widget.CompoundButton r5 = r3.f2169a     // Catch: all -> 0x005c
            int r0 = p000a.p001a.C0009j.CompoundButton_buttonTint     // Catch: all -> 0x005c
            android.content.res.ColorStateList r0 = r4.getColorStateList(r0)     // Catch: all -> 0x005c
            androidx.core.widget.C0714c.m1511a(r5, r0)     // Catch: all -> 0x005c
        L_0x003f:
            int r5 = p000a.p001a.C0009j.CompoundButton_buttonTintMode     // Catch: all -> 0x005c
            boolean r5 = r4.hasValue(r5)     // Catch: all -> 0x005c
            if (r5 == 0) goto L_0x0058
            android.widget.CompoundButton r5 = r3.f2169a     // Catch: all -> 0x005c
            int r0 = p000a.p001a.C0009j.CompoundButton_buttonTintMode     // Catch: all -> 0x005c
            r1 = -1
            int r0 = r4.getInt(r0, r1)     // Catch: all -> 0x005c
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0580c0.m2107a(r0, r1)     // Catch: all -> 0x005c
            androidx.core.widget.C0714c.m1510a(r5, r0)     // Catch: all -> 0x005c
        L_0x0058:
            r4.recycle()
            return
        L_0x005c:
            r5 = move-exception
            r4.recycle()
            throw r5
    }

    /* renamed from: b */
    android.content.res.ColorStateList m2016b() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f2170b
            return r0
    }

    /* renamed from: c */
    android.graphics.PorterDuff.Mode m2015c() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f2171c
            return r0
    }

    /* renamed from: d */
    void m2014d() {
            r1 = this;
            boolean r0 = r1.f2174f
            if (r0 == 0) goto L_0x0008
            r0 = 0
            r1.f2174f = r0
            return
        L_0x0008:
            r0 = 1
            r1.f2174f = r0
            r1.m2021a()
            return
    }
}

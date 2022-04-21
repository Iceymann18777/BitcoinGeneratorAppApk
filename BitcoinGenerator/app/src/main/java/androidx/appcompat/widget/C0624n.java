package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.n */
/* loaded from: classes.dex */
public class C0624n {

    /* renamed from: a */
    private final android.widget.ImageView f2228a;

    /* renamed from: b */
    private androidx.appcompat.widget.C0634r0 f2229b;

    /* renamed from: c */
    private androidx.appcompat.widget.C0634r0 f2230c;

    /* renamed from: d */
    private androidx.appcompat.widget.C0634r0 f2231d;

    public C0624n(android.widget.ImageView r1) {
            r0 = this;
            r0.<init>()
            r0.f2228a = r1
            return
    }

    /* renamed from: a */
    private boolean m1951a(android.graphics.drawable.Drawable r4) {
            r3 = this;
            androidx.appcompat.widget.r0 r0 = r3.f2231d
            if (r0 != 0) goto L_0x000b
            androidx.appcompat.widget.r0 r0 = new androidx.appcompat.widget.r0
            r0.<init>()
            r3.f2231d = r0
        L_0x000b:
            androidx.appcompat.widget.r0 r0 = r3.f2231d
            r0.m1909a()
            android.widget.ImageView r1 = r3.f2228a
            android.content.res.ColorStateList r1 = androidx.core.widget.C0716e.m1508a(r1)
            r2 = 1
            if (r1 == 0) goto L_0x001d
            r0.f2275d = r2
            r0.f2272a = r1
        L_0x001d:
            android.widget.ImageView r1 = r3.f2228a
            android.graphics.PorterDuff$Mode r1 = androidx.core.widget.C0716e.m1505b(r1)
            if (r1 == 0) goto L_0x0029
            r0.f2274c = r2
            r0.f2273b = r1
        L_0x0029:
            boolean r1 = r0.f2275d
            if (r1 != 0) goto L_0x0034
            boolean r1 = r0.f2274c
            if (r1 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r4 = 0
            return r4
        L_0x0034:
            android.widget.ImageView r1 = r3.f2228a
            int[] r1 = r1.getDrawableState()
            androidx.appcompat.widget.C0606j.m1998a(r4, r0, r1)
            return r2
    }

    /* renamed from: e */
    private boolean m1946e() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 21
            if (r0 <= r3) goto L_0x000f
            androidx.appcompat.widget.r0 r0 = r4.f2229b
            if (r0 == 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            return r1
        L_0x000f:
            if (r0 != r3) goto L_0x0012
            return r1
        L_0x0012:
            return r2
    }

    /* renamed from: a */
    void m1955a() {
            r3 = this;
            android.widget.ImageView r0 = r3.f2228a
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L_0x000b
            androidx.appcompat.widget.C0580c0.m2105b(r0)
        L_0x000b:
            if (r0 == 0) goto L_0x0035
            boolean r1 = r3.m1946e()
            if (r1 == 0) goto L_0x001a
            boolean r1 = r3.m1951a(r0)
            if (r1 == 0) goto L_0x001a
            return
        L_0x001a:
            androidx.appcompat.widget.r0 r1 = r3.f2230c
            if (r1 == 0) goto L_0x0028
            android.widget.ImageView r2 = r3.f2228a
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.C0606j.m1998a(r0, r1, r2)
            goto L_0x0035
        L_0x0028:
            androidx.appcompat.widget.r0 r1 = r3.f2229b
            if (r1 == 0) goto L_0x0035
            android.widget.ImageView r2 = r3.f2228a
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.C0606j.m1998a(r0, r1, r2)
        L_0x0035:
            return
    }

    /* renamed from: a */
    public void m1954a(int r2) {
            r1 = this;
            if (r2 == 0) goto L_0x0017
            android.widget.ImageView r0 = r1.f2228a
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r2 = p000a.p001a.p002k.p003a.C0010a.m4259c(r0, r2)
            if (r2 == 0) goto L_0x0011
            androidx.appcompat.widget.C0580c0.m2105b(r2)
        L_0x0011:
            android.widget.ImageView r0 = r1.f2228a
            r0.setImageDrawable(r2)
            goto L_0x001d
        L_0x0017:
            android.widget.ImageView r2 = r1.f2228a
            r0 = 0
            r2.setImageDrawable(r0)
        L_0x001d:
            r1.m1955a()
            return
    }

    /* renamed from: a */
    void m1953a(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.r0 r0 = r1.f2230c
            if (r0 != 0) goto L_0x000b
            androidx.appcompat.widget.r0 r0 = new androidx.appcompat.widget.r0
            r0.<init>()
            r1.f2230c = r0
        L_0x000b:
            androidx.appcompat.widget.r0 r0 = r1.f2230c
            r0.f2272a = r2
            r2 = 1
            r0.f2275d = r2
            r1.m1955a()
            return
    }

    /* renamed from: a */
    void m1952a(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.r0 r0 = r1.f2230c
            if (r0 != 0) goto L_0x000b
            androidx.appcompat.widget.r0 r0 = new androidx.appcompat.widget.r0
            r0.<init>()
            r1.f2230c = r0
        L_0x000b:
            androidx.appcompat.widget.r0 r0 = r1.f2230c
            r0.f2273b = r2
            r2 = 1
            r0.f2274c = r2
            r1.m1955a()
            return
    }

    /* renamed from: a */
    public void m1950a(android.util.AttributeSet r4, int r5) {
            r3 = this;
            android.widget.ImageView r0 = r3.f2228a
            android.content.Context r0 = r0.getContext()
            int[] r1 = p000a.p001a.C0009j.AppCompatImageView
            r2 = 0
            androidx.appcompat.widget.t0 r4 = androidx.appcompat.widget.C0638t0.m1900a(r0, r4, r1, r5, r2)
            android.widget.ImageView r5 = r3.f2228a     // Catch: all -> 0x0063
            android.graphics.drawable.Drawable r5 = r5.getDrawable()     // Catch: all -> 0x0063
            r0 = -1
            if (r5 != 0) goto L_0x002f
            int r1 = p000a.p001a.C0009j.AppCompatImageView_srcCompat     // Catch: all -> 0x0063
            int r1 = r4.m1888g(r1, r0)     // Catch: all -> 0x0063
            if (r1 == r0) goto L_0x002f
            android.widget.ImageView r5 = r3.f2228a     // Catch: all -> 0x0063
            android.content.Context r5 = r5.getContext()     // Catch: all -> 0x0063
            android.graphics.drawable.Drawable r5 = p000a.p001a.p002k.p003a.C0010a.m4259c(r5, r1)     // Catch: all -> 0x0063
            if (r5 == 0) goto L_0x002f
            android.widget.ImageView r1 = r3.f2228a     // Catch: all -> 0x0063
            r1.setImageDrawable(r5)     // Catch: all -> 0x0063
        L_0x002f:
            if (r5 == 0) goto L_0x0034
            androidx.appcompat.widget.C0580c0.m2105b(r5)     // Catch: all -> 0x0063
        L_0x0034:
            int r5 = p000a.p001a.C0009j.AppCompatImageView_tint     // Catch: all -> 0x0063
            boolean r5 = r4.m1889g(r5)     // Catch: all -> 0x0063
            if (r5 == 0) goto L_0x0047
            android.widget.ImageView r5 = r3.f2228a     // Catch: all -> 0x0063
            int r1 = p000a.p001a.C0009j.AppCompatImageView_tint     // Catch: all -> 0x0063
            android.content.res.ColorStateList r1 = r4.m1907a(r1)     // Catch: all -> 0x0063
            androidx.core.widget.C0716e.m1507a(r5, r1)     // Catch: all -> 0x0063
        L_0x0047:
            int r5 = p000a.p001a.C0009j.AppCompatImageView_tintMode     // Catch: all -> 0x0063
            boolean r5 = r4.m1889g(r5)     // Catch: all -> 0x0063
            if (r5 == 0) goto L_0x005f
            android.widget.ImageView r5 = r3.f2228a     // Catch: all -> 0x0063
            int r1 = p000a.p001a.C0009j.AppCompatImageView_tintMode     // Catch: all -> 0x0063
            int r0 = r4.m1894d(r1, r0)     // Catch: all -> 0x0063
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0580c0.m2107a(r0, r1)     // Catch: all -> 0x0063
            androidx.core.widget.C0716e.m1506a(r5, r0)     // Catch: all -> 0x0063
        L_0x005f:
            r4.m1908a()
            return
        L_0x0063:
            r5 = move-exception
            r4.m1908a()
            throw r5
    }

    /* renamed from: b */
    android.content.res.ColorStateList m1949b() {
            r1 = this;
            androidx.appcompat.widget.r0 r0 = r1.f2230c
            if (r0 == 0) goto L_0x0007
            android.content.res.ColorStateList r0 = r0.f2272a
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            return r0
    }

    /* renamed from: c */
    android.graphics.PorterDuff.Mode m1948c() {
            r1 = this;
            androidx.appcompat.widget.r0 r0 = r1.f2230c
            if (r0 == 0) goto L_0x0007
            android.graphics.PorterDuff$Mode r0 = r0.f2273b
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            return r0
    }

    /* renamed from: d */
    boolean m1947d() {
            r3 = this;
            android.widget.ImageView r0 = r3.f2228a
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0012
            boolean r0 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r0 == 0) goto L_0x0012
            r0 = 0
            return r0
        L_0x0012:
            r0 = 1
            return r0
    }
}

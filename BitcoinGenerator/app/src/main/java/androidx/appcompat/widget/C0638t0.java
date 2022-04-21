package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.t0 */
/* loaded from: classes.dex */
public class C0638t0 {

    /* renamed from: a */
    private final android.content.Context f2280a;

    /* renamed from: b */
    private final android.content.res.TypedArray f2281b;

    /* renamed from: c */
    private android.util.TypedValue f2282c;

    private C0638t0(android.content.Context r1, android.content.res.TypedArray r2) {
            r0 = this;
            r0.<init>()
            r0.f2280a = r1
            r0.f2281b = r2
            return
    }

    /* renamed from: a */
    public static androidx.appcompat.widget.C0638t0 m1902a(android.content.Context r1, int r2, int[] r3) {
            androidx.appcompat.widget.t0 r0 = new androidx.appcompat.widget.t0
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r3)
            r0.<init>(r1, r2)
            return r0
    }

    /* renamed from: a */
    public static androidx.appcompat.widget.C0638t0 m1901a(android.content.Context r1, android.util.AttributeSet r2, int[] r3) {
            androidx.appcompat.widget.t0 r0 = new androidx.appcompat.widget.t0
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r3)
            r0.<init>(r1, r2)
            return r0
    }

    /* renamed from: a */
    public static androidx.appcompat.widget.C0638t0 m1900a(android.content.Context r1, android.util.AttributeSet r2, int[] r3, int r4, int r5) {
            androidx.appcompat.widget.t0 r0 = new androidx.appcompat.widget.t0
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r3, r4, r5)
            r0.<init>(r1, r2)
            return r0
    }

    /* renamed from: a */
    public float m1906a(int r2, float r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f2281b
            float r2 = r0.getFloat(r2, r3)
            return r2
    }

    /* renamed from: a */
    public int m1905a(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f2281b
            int r2 = r0.getColor(r2, r3)
            return r2
    }

    /* renamed from: a */
    public android.content.res.ColorStateList m1907a(int r3) {
            r2 = this;
            android.content.res.TypedArray r0 = r2.f2281b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.f2281b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.f2280a
            android.content.res.ColorStateList r0 = p000a.p001a.p002k.p003a.C0010a.m4260b(r1, r0)
            if (r0 == 0) goto L_0x001a
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.f2281b
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
    }

    /* renamed from: a */
    public android.graphics.Typeface m1904a(int r3, int r4, p000a.p018g.p019d.p020c.C0136f.AbstractC0137a r5) {
            r2 = this;
            android.content.res.TypedArray r0 = r2.f2281b
            r1 = 0
            int r3 = r0.getResourceId(r3, r1)
            if (r3 != 0) goto L_0x000b
            r3 = 0
            return r3
        L_0x000b:
            android.util.TypedValue r0 = r2.f2282c
            if (r0 != 0) goto L_0x0016
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r2.f2282c = r0
        L_0x0016:
            android.content.Context r0 = r2.f2280a
            android.util.TypedValue r1 = r2.f2282c
            android.graphics.Typeface r3 = p000a.p018g.p019d.p020c.C0136f.m3687a(r0, r3, r1, r4, r5)
            return r3
    }

    /* renamed from: a */
    public void m1908a() {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f2281b
            r0.recycle()
            return
    }

    /* renamed from: a */
    public boolean m1903a(int r2, boolean r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f2281b
            boolean r2 = r0.getBoolean(r2, r3)
            return r2
    }

    /* renamed from: b */
    public int m1898b(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f2281b
            int r2 = r0.getDimensionPixelOffset(r2, r3)
            return r2
    }

    /* renamed from: b */
    public android.graphics.drawable.Drawable m1899b(int r3) {
            r2 = this;
            android.content.res.TypedArray r0 = r2.f2281b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.f2281b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.f2280a
            android.graphics.drawable.Drawable r3 = p000a.p001a.p002k.p003a.C0010a.m4259c(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.f2281b
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
    }

    /* renamed from: c */
    public int m1896c(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f2281b
            int r2 = r0.getDimensionPixelSize(r2, r3)
            return r2
    }

    /* renamed from: c */
    public android.graphics.drawable.Drawable m1897c(int r4) {
            r3 = this;
            android.content.res.TypedArray r0 = r3.f2281b
            boolean r0 = r0.hasValue(r4)
            if (r0 == 0) goto L_0x001d
            android.content.res.TypedArray r0 = r3.f2281b
            r1 = 0
            int r4 = r0.getResourceId(r4, r1)
            if (r4 == 0) goto L_0x001d
            androidx.appcompat.widget.j r0 = androidx.appcompat.widget.C0606j.m2013a()
            android.content.Context r1 = r3.f2280a
            r2 = 1
            android.graphics.drawable.Drawable r4 = r0.m2006a(r1, r4, r2)
            return r4
        L_0x001d:
            r4 = 0
            return r4
    }

    /* renamed from: d */
    public int m1894d(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f2281b
            int r2 = r0.getInt(r2, r3)
            return r2
    }

    /* renamed from: d */
    public java.lang.String m1895d(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f2281b
            java.lang.String r2 = r0.getString(r2)
            return r2
    }

    /* renamed from: e */
    public int m1892e(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f2281b
            int r2 = r0.getInteger(r2, r3)
            return r2
    }

    /* renamed from: e */
    public java.lang.CharSequence m1893e(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f2281b
            java.lang.CharSequence r2 = r0.getText(r2)
            return r2
    }

    /* renamed from: f */
    public int m1890f(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f2281b
            int r2 = r0.getLayoutDimension(r2, r3)
            return r2
    }

    /* renamed from: f */
    public java.lang.CharSequence[] m1891f(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f2281b
            java.lang.CharSequence[] r2 = r0.getTextArray(r2)
            return r2
    }

    /* renamed from: g */
    public int m1888g(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f2281b
            int r2 = r0.getResourceId(r2, r3)
            return r2
    }

    /* renamed from: g */
    public boolean m1889g(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f2281b
            boolean r2 = r0.hasValue(r2)
            return r2
    }
}

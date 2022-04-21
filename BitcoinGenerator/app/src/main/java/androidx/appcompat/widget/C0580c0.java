package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.c0 */
/* loaded from: classes.dex */
public class C0580c0 {
    static {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 18
            if (r0 < r1) goto L_0x0010
            java.lang.String r0 = "android.graphics.Insets"
            java.lang.Class.forName(r0)     // Catch: ClassNotFoundException -> 0x0010
        L_0x0010:
            return
    }

    /* renamed from: a */
    public static android.graphics.PorterDuff.Mode m2107a(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = 3
            if (r1 == r0) goto L_0x001d
            r0 = 5
            if (r1 == r0) goto L_0x001a
            r0 = 9
            if (r1 == r0) goto L_0x0017
            switch(r1) {
                case 14: goto L_0x0014;
                case 15: goto L_0x0011;
                case 16: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            return r2
        L_0x000e:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.ADD
            return r1
        L_0x0011:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SCREEN
            return r1
        L_0x0014:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            return r1
        L_0x0017:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            return r1
        L_0x001a:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            return r1
        L_0x001d:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OVER
            return r1
    }

    /* renamed from: a */
    public static boolean m2106a(android.graphics.drawable.Drawable r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 15
            r2 = 0
            if (r0 >= r1) goto L_0x000c
            boolean r0 = r4 instanceof android.graphics.drawable.InsetDrawable
            if (r0 == 0) goto L_0x000c
            return r2
        L_0x000c:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r1) goto L_0x0015
            boolean r0 = r4 instanceof android.graphics.drawable.GradientDrawable
            if (r0 == 0) goto L_0x0015
            return r2
        L_0x0015:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 >= r1) goto L_0x0020
            boolean r0 = r4 instanceof android.graphics.drawable.LayerDrawable
            if (r0 == 0) goto L_0x0020
            return r2
        L_0x0020:
            boolean r0 = r4 instanceof android.graphics.drawable.DrawableContainer
            if (r0 == 0) goto L_0x0042
            android.graphics.drawable.Drawable$ConstantState r4 = r4.getConstantState()
            boolean r0 = r4 instanceof android.graphics.drawable.DrawableContainer.DrawableContainerState
            if (r0 == 0) goto L_0x0067
            android.graphics.drawable.DrawableContainer$DrawableContainerState r4 = (android.graphics.drawable.DrawableContainer.DrawableContainerState) r4
            android.graphics.drawable.Drawable[] r4 = r4.getChildren()
            int r0 = r4.length
            r1 = 0
        L_0x0034:
            if (r1 >= r0) goto L_0x0067
            r3 = r4[r1]
            boolean r3 = m2106a(r3)
            if (r3 != 0) goto L_0x003f
            return r2
        L_0x003f:
            int r1 = r1 + 1
            goto L_0x0034
        L_0x0042:
            boolean r0 = r4 instanceof androidx.core.graphics.drawable.AbstractC0700c
            if (r0 == 0) goto L_0x0051
            androidx.core.graphics.drawable.c r4 = (androidx.core.graphics.drawable.AbstractC0700c) r4
            android.graphics.drawable.Drawable r4 = r4.mo1590a()
        L_0x004c:
            boolean r4 = m2106a(r4)
            return r4
        L_0x0051:
            boolean r0 = r4 instanceof p000a.p001a.p004l.p005a.C0024c
            if (r0 == 0) goto L_0x005c
            a.a.l.a.c r4 = (p000a.p001a.p004l.p005a.C0024c) r4
            android.graphics.drawable.Drawable r4 = r4.m4202a()
            goto L_0x004c
        L_0x005c:
            boolean r0 = r4 instanceof android.graphics.drawable.ScaleDrawable
            if (r0 == 0) goto L_0x0067
            android.graphics.drawable.ScaleDrawable r4 = (android.graphics.drawable.ScaleDrawable) r4
            android.graphics.drawable.Drawable r4 = r4.getDrawable()
            goto L_0x004c
        L_0x0067:
            r4 = 1
            return r4
    }

    /* renamed from: b */
    static void m2105b(android.graphics.drawable.Drawable r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 != r1) goto L_0x0019
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "android.graphics.drawable.VectorDrawable"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0019
            m2104c(r2)
        L_0x0019:
            return
    }

    /* renamed from: c */
    private static void m2104c(android.graphics.drawable.Drawable r2) {
            int[] r0 = r2.getState()
            if (r0 == 0) goto L_0x0010
            int r1 = r0.length
            if (r1 != 0) goto L_0x000a
            goto L_0x0010
        L_0x000a:
            int[] r1 = androidx.appcompat.widget.C0628o0.f2258f
            r2.setState(r1)
            goto L_0x0015
        L_0x0010:
            int[] r1 = androidx.appcompat.widget.C0628o0.f2257e
            r2.setState(r1)
        L_0x0015:
            r2.setState(r0)
            return
    }
}

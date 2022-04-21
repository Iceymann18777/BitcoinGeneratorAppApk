package androidx.core.widget;

/* renamed from: androidx.core.widget.e */
/* loaded from: classes.dex */
public class C0716e {
    /* renamed from: a */
    public static android.content.res.ColorStateList m1508a(android.widget.ImageView r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000b
            android.content.res.ColorStateList r2 = r2.getImageTintList()
            return r2
        L_0x000b:
            boolean r0 = r2 instanceof androidx.core.widget.AbstractC0723k
            if (r0 == 0) goto L_0x0016
            androidx.core.widget.k r2 = (androidx.core.widget.AbstractC0723k) r2
            android.content.res.ColorStateList r2 = r2.getSupportImageTintList()
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            return r2
    }

    /* renamed from: a */
    public static void m1507a(android.widget.ImageView r2, android.content.res.ColorStateList r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x0035
            r2.setImageTintList(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 != r1) goto L_0x003e
            android.graphics.drawable.Drawable r3 = r2.getDrawable()
            android.content.res.ColorStateList r0 = r2.getImageTintList()
            if (r0 == 0) goto L_0x001f
            android.graphics.PorterDuff$Mode r0 = r2.getImageTintMode()
            if (r0 == 0) goto L_0x001f
            r0 = 1
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            if (r3 == 0) goto L_0x003e
            if (r0 == 0) goto L_0x003e
            boolean r0 = r3.isStateful()
            if (r0 == 0) goto L_0x0031
            int[] r0 = r2.getDrawableState()
            r3.setState(r0)
        L_0x0031:
            r2.setImageDrawable(r3)
            goto L_0x003e
        L_0x0035:
            boolean r0 = r2 instanceof androidx.core.widget.AbstractC0723k
            if (r0 == 0) goto L_0x003e
            androidx.core.widget.k r2 = (androidx.core.widget.AbstractC0723k) r2
            r2.setSupportImageTintList(r3)
        L_0x003e:
            return
    }

    /* renamed from: a */
    public static void m1506a(android.widget.ImageView r2, android.graphics.PorterDuff.Mode r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x0035
            r2.setImageTintMode(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 != r1) goto L_0x003e
            android.graphics.drawable.Drawable r3 = r2.getDrawable()
            android.content.res.ColorStateList r0 = r2.getImageTintList()
            if (r0 == 0) goto L_0x001f
            android.graphics.PorterDuff$Mode r0 = r2.getImageTintMode()
            if (r0 == 0) goto L_0x001f
            r0 = 1
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            if (r3 == 0) goto L_0x003e
            if (r0 == 0) goto L_0x003e
            boolean r0 = r3.isStateful()
            if (r0 == 0) goto L_0x0031
            int[] r0 = r2.getDrawableState()
            r3.setState(r0)
        L_0x0031:
            r2.setImageDrawable(r3)
            goto L_0x003e
        L_0x0035:
            boolean r0 = r2 instanceof androidx.core.widget.AbstractC0723k
            if (r0 == 0) goto L_0x003e
            androidx.core.widget.k r2 = (androidx.core.widget.AbstractC0723k) r2
            r2.setSupportImageTintMode(r3)
        L_0x003e:
            return
    }

    /* renamed from: b */
    public static android.graphics.PorterDuff.Mode m1505b(android.widget.ImageView r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000b
            android.graphics.PorterDuff$Mode r2 = r2.getImageTintMode()
            return r2
        L_0x000b:
            boolean r0 = r2 instanceof androidx.core.widget.AbstractC0723k
            if (r0 == 0) goto L_0x0016
            androidx.core.widget.k r2 = (androidx.core.widget.AbstractC0723k) r2
            android.graphics.PorterDuff$Mode r2 = r2.getSupportImageTintMode()
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            return r2
    }
}

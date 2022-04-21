package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.r */
/* loaded from: classes.dex */
class C0633r {

    /* renamed from: c */
    private static final int[] f2269c = null;

    /* renamed from: a */
    private final android.widget.ProgressBar f2270a;

    /* renamed from: b */
    private android.graphics.Bitmap f2271b;

    static {
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA  , data: [16843067, 16843068} // fill-array
            androidx.appcompat.widget.C0633r.f2269c = r0
            return
    }

    C0633r(android.widget.ProgressBar r1) {
            r0 = this;
            r0.<init>()
            r0.f2270a = r1
            return
    }

    /* renamed from: a */
    private android.graphics.drawable.Drawable m1912a(android.graphics.drawable.Drawable r7) {
            r6 = this;
            boolean r0 = r7 instanceof android.graphics.drawable.AnimationDrawable
            if (r0 == 0) goto L_0x0035
            android.graphics.drawable.AnimationDrawable r7 = (android.graphics.drawable.AnimationDrawable) r7
            int r0 = r7.getNumberOfFrames()
            android.graphics.drawable.AnimationDrawable r1 = new android.graphics.drawable.AnimationDrawable
            r1.<init>()
            boolean r2 = r7.isOneShot()
            r1.setOneShot(r2)
            r2 = 0
        L_0x0017:
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r2 >= r0) goto L_0x0031
            android.graphics.drawable.Drawable r4 = r7.getFrame(r2)
            r5 = 1
            android.graphics.drawable.Drawable r4 = r6.m1911a(r4, r5)
            r4.setLevel(r3)
            int r3 = r7.getDuration(r2)
            r1.addFrame(r4, r3)
            int r2 = r2 + 1
            goto L_0x0017
        L_0x0031:
            r1.setLevel(r3)
            r7 = r1
        L_0x0035:
            return r7
    }

    /* renamed from: a */
    private android.graphics.drawable.Drawable m1911a(android.graphics.drawable.Drawable r8, boolean r9) {
            r7 = this;
            boolean r0 = r8 instanceof androidx.core.graphics.drawable.AbstractC0700c
            if (r0 == 0) goto L_0x0016
            r0 = r8
            androidx.core.graphics.drawable.c r0 = (androidx.core.graphics.drawable.AbstractC0700c) r0
            android.graphics.drawable.Drawable r1 = r0.mo1590a()
            if (r1 == 0) goto L_0x009a
            android.graphics.drawable.Drawable r9 = r7.m1911a(r1, r9)
            r0.mo1588a(r9)
            goto L_0x009a
        L_0x0016:
            boolean r0 = r8 instanceof android.graphics.drawable.LayerDrawable
            r1 = 1
            if (r0 == 0) goto L_0x0058
            android.graphics.drawable.LayerDrawable r8 = (android.graphics.drawable.LayerDrawable) r8
            int r9 = r8.getNumberOfLayers()
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r9]
            r2 = 0
            r3 = 0
        L_0x0025:
            if (r3 >= r9) goto L_0x0046
            int r4 = r8.getId(r3)
            android.graphics.drawable.Drawable r5 = r8.getDrawable(r3)
            r6 = 16908301(0x102000d, float:2.3877265E-38)
            if (r4 == r6) goto L_0x003c
            r6 = 16908303(0x102000f, float:2.387727E-38)
            if (r4 != r6) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r4 = 0
            goto L_0x003d
        L_0x003c:
            r4 = 1
        L_0x003d:
            android.graphics.drawable.Drawable r4 = r7.m1911a(r5, r4)
            r0[r3] = r4
            int r3 = r3 + 1
            goto L_0x0025
        L_0x0046:
            android.graphics.drawable.LayerDrawable r1 = new android.graphics.drawable.LayerDrawable
            r1.<init>(r0)
        L_0x004b:
            if (r2 >= r9) goto L_0x0057
            int r0 = r8.getId(r2)
            r1.setId(r2, r0)
            int r2 = r2 + 1
            goto L_0x004b
        L_0x0057:
            return r1
        L_0x0058:
            boolean r0 = r8 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x009a
            android.graphics.drawable.BitmapDrawable r8 = (android.graphics.drawable.BitmapDrawable) r8
            android.graphics.Bitmap r0 = r8.getBitmap()
            android.graphics.Bitmap r2 = r7.f2271b
            if (r2 != 0) goto L_0x0068
            r7.f2271b = r0
        L_0x0068:
            android.graphics.drawable.ShapeDrawable r2 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.Shape r3 = r7.m1910b()
            r2.<init>(r3)
            android.graphics.BitmapShader r3 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.Shader$TileMode r5 = android.graphics.Shader.TileMode.CLAMP
            r3.<init>(r0, r4, r5)
            android.graphics.Paint r0 = r2.getPaint()
            r0.setShader(r3)
            android.graphics.Paint r0 = r2.getPaint()
            android.graphics.Paint r8 = r8.getPaint()
            android.graphics.ColorFilter r8 = r8.getColorFilter()
            r0.setColorFilter(r8)
            if (r9 == 0) goto L_0x0099
            android.graphics.drawable.ClipDrawable r8 = new android.graphics.drawable.ClipDrawable
            r9 = 3
            r8.<init>(r2, r9, r1)
            goto L_0x009a
        L_0x0099:
            r8 = r2
        L_0x009a:
            return r8
    }

    /* renamed from: b */
    private android.graphics.drawable.shapes.Shape m1910b() {
            r3 = this;
            r0 = 8
            float[] r0 = new float[r0]
            r0 = {x000e: FILL_ARRAY_DATA  , data: [1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584} // fill-array
            android.graphics.drawable.shapes.RoundRectShape r1 = new android.graphics.drawable.shapes.RoundRectShape
            r2 = 0
            r1.<init>(r0, r2, r2)
            return r1
    }

    /* renamed from: a */
    android.graphics.Bitmap m1913a() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.f2271b
            return r0
    }

    /* renamed from: a */
    void mo1845a(android.util.AttributeSet r4, int r5) {
            r3 = this;
            android.widget.ProgressBar r0 = r3.f2270a
            android.content.Context r0 = r0.getContext()
            int[] r1 = androidx.appcompat.widget.C0633r.f2269c
            r2 = 0
            androidx.appcompat.widget.t0 r4 = androidx.appcompat.widget.C0638t0.m1900a(r0, r4, r1, r5, r2)
            android.graphics.drawable.Drawable r5 = r4.m1897c(r2)
            if (r5 == 0) goto L_0x001c
            android.widget.ProgressBar r0 = r3.f2270a
            android.graphics.drawable.Drawable r5 = r3.m1912a(r5)
            r0.setIndeterminateDrawable(r5)
        L_0x001c:
            r5 = 1
            android.graphics.drawable.Drawable r5 = r4.m1897c(r5)
            if (r5 == 0) goto L_0x002c
            android.widget.ProgressBar r0 = r3.f2270a
            android.graphics.drawable.Drawable r5 = r3.m1911a(r5, r2)
            r0.setProgressDrawable(r5)
        L_0x002c:
            r4.m1908a()
            return
    }
}

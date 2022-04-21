package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.l */
/* loaded from: classes.dex */
class C0616l {
    /* renamed from: a */
    static android.view.inputmethod.InputConnection m1972a(android.view.inputmethod.InputConnection r1, android.view.inputmethod.EditorInfo r2, android.view.View r3) {
            if (r1 == 0) goto L_0x0020
            java.lang.CharSequence r0 = r2.hintText
            if (r0 != 0) goto L_0x0020
            android.view.ViewParent r3 = r3.getParent()
        L_0x000a:
            boolean r0 = r3 instanceof android.view.View
            if (r0 == 0) goto L_0x0020
            boolean r0 = r3 instanceof androidx.appcompat.widget.AbstractC0567a1
            if (r0 == 0) goto L_0x001b
            androidx.appcompat.widget.a1 r3 = (androidx.appcompat.widget.AbstractC0567a1) r3
            java.lang.CharSequence r3 = r3.m2138a()
            r2.hintText = r3
            goto L_0x0020
        L_0x001b:
            android.view.ViewParent r3 = r3.getParent()
            goto L_0x000a
        L_0x0020:
            return r1
    }
}

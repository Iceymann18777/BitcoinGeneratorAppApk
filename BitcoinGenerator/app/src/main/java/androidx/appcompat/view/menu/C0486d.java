package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.d */
/* loaded from: classes.dex */
class C0486d<T> {

    /* renamed from: a */
    final T f1646a;

    C0486d(T r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L_0x0008
            r1.f1646a = r2
            return
        L_0x0008:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Wrapped Object can not be null."
            r2.<init>(r0)
            throw r2
    }
}

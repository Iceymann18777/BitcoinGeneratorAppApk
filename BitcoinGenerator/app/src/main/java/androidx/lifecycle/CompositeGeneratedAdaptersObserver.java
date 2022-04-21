package androidx.lifecycle;

/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements androidx.lifecycle.AbstractC0741d {

    /* renamed from: a */
    private final androidx.lifecycle.AbstractC0740c[] f2778a;

    CompositeGeneratedAdaptersObserver(androidx.lifecycle.AbstractC0740c[] r1) {
            r0 = this;
            r0.<init>()
            r0.f2778a = r1
            return
    }

    @Override // androidx.lifecycle.AbstractC0741d
    /* renamed from: a */
    public void mo1388a(androidx.lifecycle.AbstractC0746g r7, androidx.lifecycle.AbstractC0742e.EnumC0743a r8) {
            r6 = this;
            androidx.lifecycle.k r0 = new androidx.lifecycle.k
            r0.<init>()
            androidx.lifecycle.c[] r1 = r6.f2778a
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L_0x000a:
            if (r4 >= r2) goto L_0x0014
            r5 = r1[r4]
            r5.m1389a(r7, r8, r3, r0)
            int r4 = r4 + 1
            goto L_0x000a
        L_0x0014:
            androidx.lifecycle.c[] r1 = r6.f2778a
            int r2 = r1.length
        L_0x0017:
            if (r3 >= r2) goto L_0x0022
            r4 = r1[r3]
            r5 = 1
            r4.m1389a(r7, r8, r5, r0)
            int r3 = r3 + 1
            goto L_0x0017
        L_0x0022:
            return
    }
}

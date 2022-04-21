package androidx.lifecycle;

/* renamed from: androidx.lifecycle.q */
/* loaded from: classes.dex */
public class C0759q {

    /* renamed from: a */
    private final androidx.lifecycle.C0759q.AbstractC0760a f2827a;

    /* renamed from: b */
    private final androidx.lifecycle.C0761r f2828b;

    /* renamed from: androidx.lifecycle.q$a */
    /* loaded from: classes.dex */
    public interface AbstractC0760a {
        /* renamed from: a */
        <T extends androidx.lifecycle.AbstractC0758p> T mo1347a(java.lang.Class<T> r1);
    }

    public C0759q(androidx.lifecycle.C0761r r1, androidx.lifecycle.C0759q.AbstractC0760a r2) {
            r0 = this;
            r0.<init>()
            r0.f2827a = r2
            r0.f2828b = r1
            return
    }

    /* renamed from: a */
    public <T extends androidx.lifecycle.AbstractC0758p> T m1349a(java.lang.Class<T> r4) {
            r3 = this;
            java.lang.String r0 = r4.getCanonicalName()
            if (r0 == 0) goto L_0x001c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            androidx.lifecycle.p r4 = r3.m1348a(r0, r4)
            return r4
        L_0x001c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Local and anonymous classes can not be ViewModels"
            r4.<init>(r0)
            throw r4
    }

    /* renamed from: a */
    public <T extends androidx.lifecycle.AbstractC0758p> T m1348a(java.lang.String r3, java.lang.Class<T> r4) {
            r2 = this;
            androidx.lifecycle.r r0 = r2.f2828b
            androidx.lifecycle.p r0 = r0.m1345a(r3)
            boolean r1 = r4.isInstance(r0)
            if (r1 == 0) goto L_0x000d
            return r0
        L_0x000d:
            androidx.lifecycle.q$a r0 = r2.f2827a
            androidx.lifecycle.p r4 = r0.mo1347a(r4)
            androidx.lifecycle.r r0 = r2.f2828b
            r0.m1344a(r3, r4)
            return r4
    }
}

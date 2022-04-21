package androidx.core.app;

/* renamed from: androidx.core.app.a */
/* loaded from: classes.dex */
public class C0688a extends p000a.p018g.p019d.C0124a {

    /* renamed from: c */
    private static androidx.core.app.C0688a.AbstractC0690b f2619c;

    /* renamed from: androidx.core.app.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC0689a {
    }

    /* renamed from: androidx.core.app.a$b */
    /* loaded from: classes.dex */
    public interface AbstractC0690b {
        /* renamed from: a */
        boolean m1634a(android.app.Activity r1, int r2, int r3, android.content.Intent r4);
    }

    /* renamed from: androidx.core.app.a$c */
    /* loaded from: classes.dex */
    public interface AbstractC0691c {
    }

    /* renamed from: a */
    public static androidx.core.app.C0688a.AbstractC0690b m1637a() {
            androidx.core.app.a$b r0 = androidx.core.app.C0688a.f2619c
            return r0
    }

    /* renamed from: a */
    public static void m1636a(android.app.Activity r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x000a
            r2.finishAffinity()
            goto L_0x000d
        L_0x000a:
            r2.finish()
        L_0x000d:
            return
    }

    /* renamed from: a */
    public static void m1635a(android.app.Activity r2, android.content.Intent r3, int r4, android.os.Bundle r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x000a
            r2.startActivityForResult(r3, r4, r5)
            goto L_0x000d
        L_0x000a:
            r2.startActivityForResult(r3, r4)
        L_0x000d:
            return
    }
}

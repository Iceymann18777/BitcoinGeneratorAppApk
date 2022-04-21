package androidx.core.app;

/* loaded from: classes.dex */
public class CoreComponentFactory extends android.app.AppComponentFactory {

    /* renamed from: androidx.core.app.CoreComponentFactory$a */
    /* loaded from: classes.dex */
    public interface AbstractC0687a {
        /* renamed from: a */
        java.lang.Object m1638a();
    }

    public CoreComponentFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    static <T> T m1639a(T r1) {
            boolean r0 = r1 instanceof androidx.core.app.CoreComponentFactory.AbstractC0687a
            if (r0 == 0) goto L_0x000e
            r0 = r1
            androidx.core.app.CoreComponentFactory$a r0 = (androidx.core.app.CoreComponentFactory.AbstractC0687a) r0
            java.lang.Object r0 = r0.m1638a()
            if (r0 == 0) goto L_0x000e
            return r0
        L_0x000e:
            return r1
    }

    @Override // android.app.AppComponentFactory
    public android.app.Activity instantiateActivity(java.lang.ClassLoader r1, java.lang.String r2, android.content.Intent r3) {
            r0 = this;
            android.app.Activity r1 = super.instantiateActivity(r1, r2, r3)
            java.lang.Object r1 = m1639a(r1)
            android.app.Activity r1 = (android.app.Activity) r1
            return r1
    }

    @Override // android.app.AppComponentFactory
    public android.app.Application instantiateApplication(java.lang.ClassLoader r1, java.lang.String r2) {
            r0 = this;
            android.app.Application r1 = super.instantiateApplication(r1, r2)
            java.lang.Object r1 = m1639a(r1)
            android.app.Application r1 = (android.app.Application) r1
            return r1
    }

    @Override // android.app.AppComponentFactory
    public android.content.ContentProvider instantiateProvider(java.lang.ClassLoader r1, java.lang.String r2) {
            r0 = this;
            android.content.ContentProvider r1 = super.instantiateProvider(r1, r2)
            java.lang.Object r1 = m1639a(r1)
            android.content.ContentProvider r1 = (android.content.ContentProvider) r1
            return r1
    }

    @Override // android.app.AppComponentFactory
    public android.content.BroadcastReceiver instantiateReceiver(java.lang.ClassLoader r1, java.lang.String r2, android.content.Intent r3) {
            r0 = this;
            android.content.BroadcastReceiver r1 = super.instantiateReceiver(r1, r2, r3)
            java.lang.Object r1 = m1639a(r1)
            android.content.BroadcastReceiver r1 = (android.content.BroadcastReceiver) r1
            return r1
    }

    @Override // android.app.AppComponentFactory
    public android.app.Service instantiateService(java.lang.ClassLoader r1, java.lang.String r2, android.content.Intent r3) {
            r0 = this;
            android.app.Service r1 = super.instantiateService(r1, r2, r3)
            java.lang.Object r1 = m1639a(r1)
            android.app.Service r1 = (android.app.Service) r1
            return r1
    }
}

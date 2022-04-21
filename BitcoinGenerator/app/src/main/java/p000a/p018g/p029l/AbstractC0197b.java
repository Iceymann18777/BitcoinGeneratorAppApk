package p000a.p018g.p029l;

/* renamed from: a.g.l.b */
/* loaded from: classes.dex */
public abstract class AbstractC0197b {

    /* renamed from: a */
    private p000a.p018g.p029l.AbstractC0197b.AbstractC0199b f647a;

    /* renamed from: a.g.l.b$a */
    /* loaded from: classes.dex */
    public interface AbstractC0198a {
    }

    /* renamed from: a.g.l.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC0199b {
        void onActionProviderVisibilityChanged(boolean r1);
    }

    public AbstractC0197b(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public android.view.View mo2337a(android.view.MenuItem r1) {
            r0 = this;
            android.view.View r1 = r0.mo2342c()
            return r1
    }

    /* renamed from: a */
    public void m3492a(p000a.p018g.p029l.AbstractC0197b.AbstractC0198a r1) {
            r0 = this;
            return
    }

    /* renamed from: a */
    public void mo2338a(p000a.p018g.p029l.AbstractC0197b.AbstractC0199b r3) {
            r2 = this;
            a.g.l.b$b r0 = r2.f647a
            if (r0 == 0) goto L_0x0029
            if (r3 == 0) goto L_0x0029
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this "
            r0.append(r1)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " instance while it is still in use somewhere else?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ActionProvider(support)"
            android.util.Log.w(r1, r0)
        L_0x0029:
            r2.f647a = r3
            return
    }

    /* renamed from: a */
    public void mo2343a(android.view.SubMenu r1) {
            r0 = this;
            return
    }

    /* renamed from: a */
    public boolean mo2344a() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: b */
    public boolean mo2336b() {
            r1 = this;
            r0 = 1
            return r0
    }

    /* renamed from: c */
    public abstract android.view.View mo2342c();

    /* renamed from: d */
    public boolean mo2341d() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: e */
    public boolean mo2335e() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: f */
    public void m3491f() {
            r1 = this;
            r0 = 0
            r1.f647a = r0
            return
    }
}

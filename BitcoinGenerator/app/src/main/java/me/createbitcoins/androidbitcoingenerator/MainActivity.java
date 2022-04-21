package me.createbitcoins.androidbitcoingenerator;

/* loaded from: classes.dex */
public class MainActivity extends androidx.appcompat.app.ActivityC0442e implements com.google.android.material.navigation.NavigationView.AbstractC0985b {

    /* renamed from: p */
    private androidx.drawerlayout.widget.DrawerLayout f3666p;

    public MainActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.material.navigation.NavigationView.AbstractC0985b
    /* renamed from: a */
    public boolean mo14a(android.view.MenuItem r3) {
            r2 = this;
            int r3 = r3.getItemId()
            r0 = 2131296262(0x7f090006, float:1.8210436E38)
            r1 = 2131296343(0x7f090057, float:1.82106E38)
            if (r3 == r0) goto L_0x0033
            r0 = 2131296308(0x7f090034, float:1.821053E38)
            if (r3 == r0) goto L_0x0025
            r0 = 2131296375(0x7f090077, float:1.8210665E38)
            if (r3 == r0) goto L_0x0017
            goto L_0x0046
        L_0x0017:
            a.j.a.h r3 = r2.m3174e()
            a.j.a.m r3 = r3.mo3111a()
            me.createbitcoins.androidbitcoingenerator.c r0 = new me.createbitcoins.androidbitcoingenerator.c
            r0.<init>()
            goto L_0x0040
        L_0x0025:
            a.j.a.h r3 = r2.m3174e()
            a.j.a.m r3 = r3.mo3111a()
            me.createbitcoins.androidbitcoingenerator.b r0 = new me.createbitcoins.androidbitcoingenerator.b
            r0.<init>()
            goto L_0x0040
        L_0x0033:
            a.j.a.h r3 = r2.m3174e()
            a.j.a.m r3 = r3.mo3111a()
            me.createbitcoins.androidbitcoingenerator.a r0 = new me.createbitcoins.androidbitcoingenerator.a
            r0.<init>()
        L_0x0040:
            r3.mo2993a(r1, r0)
            r3.mo2994a()
        L_0x0046:
            androidx.drawerlayout.widget.DrawerLayout r3 = r2.f3666p
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r3.m1476a(r0)
            r3 = 1
            return r3
    }

    @Override // p000a.p036j.p037a.ActivityC0255d, android.app.Activity
    public void onBackPressed() {
            r2 = this;
            androidx.drawerlayout.widget.DrawerLayout r0 = r2.f3666p
            r1 = 8388611(0x800003, float:1.1754948E-38)
            boolean r0 = r0.m1446e(r1)
            if (r0 == 0) goto L_0x0011
            androidx.drawerlayout.widget.DrawerLayout r0 = r2.f3666p
            r0.m1476a(r1)
            goto L_0x0014
        L_0x0011:
            super.onBackPressed()
        L_0x0014:
            return
    }

    @Override // androidx.appcompat.app.ActivityC0442e, p000a.p036j.p037a.ActivityC0255d, androidx.core.app.ActivityC0693c, android.app.Activity
    protected void onCreate(android.os.Bundle r8) {
            r7 = this;
            super.onCreate(r8)
            r8 = 2131492892(0x7f0c001c, float:1.8609249E38)
            r7.setContentView(r8)
            r8 = 2131296481(0x7f0900e1, float:1.821088E38)
            android.view.View r8 = r7.findViewById(r8)
            r3 = r8
            androidx.appcompat.widget.Toolbar r3 = (androidx.appcompat.widget.Toolbar) r3
            r7.m2635a(r3)
            r8 = 2131296326(0x7f090046, float:1.8210566E38)
            android.view.View r8 = r7.findViewById(r8)
            androidx.drawerlayout.widget.DrawerLayout r8 = (androidx.drawerlayout.widget.DrawerLayout) r8
            r7.f3666p = r8
            r8 = 2131296376(0x7f090078, float:1.8210667E38)
            android.view.View r8 = r7.findViewById(r8)
            com.google.android.material.navigation.NavigationView r8 = (com.google.android.material.navigation.NavigationView) r8
            r8.setNavigationItemSelectedListener(r7)
            androidx.appcompat.app.b r6 = new androidx.appcompat.app.b
            androidx.drawerlayout.widget.DrawerLayout r2 = r7.f3666p
            r4 = 2131689526(0x7f0f0036, float:1.900807E38)
            r5 = 2131689525(0x7f0f0035, float:1.9008068E38)
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.drawerlayout.widget.DrawerLayout r0 = r7.f3666p
            r0.m1466a(r6)
            r6.m2651b()
            a.j.a.h r0 = r7.m3174e()
            a.j.a.m r0 = r0.mo3111a()
            me.createbitcoins.androidbitcoingenerator.c r1 = new me.createbitcoins.androidbitcoingenerator.c
            r1.<init>()
            r2 = 2131296343(0x7f090057, float:1.82106E38)
            r0.mo2993a(r2, r1)
            r0.mo2994a()
            r0 = 2131296375(0x7f090077, float:1.8210665E38)
            r8.setCheckedItem(r0)
            return
    }
}

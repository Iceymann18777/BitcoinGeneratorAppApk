package androidx.lifecycle;

/* renamed from: androidx.lifecycle.o */
/* loaded from: classes.dex */
public class FragmentC0756o extends android.app.Fragment {

    /* renamed from: b */
    private androidx.lifecycle.FragmentC0756o.AbstractC0757a f2826b;

    /* renamed from: androidx.lifecycle.o$a */
    /* loaded from: classes.dex */
    interface AbstractC0757a {
        /* renamed from: a */
        void m1353a();

        /* renamed from: b */
        void m1352b();

        /* renamed from: c */
        void m1351c();
    }

    public FragmentC0756o() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static void m1358a(android.app.Activity r3) {
            android.app.FragmentManager r3 = r3.getFragmentManager()
            java.lang.String r0 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"
            android.app.Fragment r1 = r3.findFragmentByTag(r0)
            if (r1 != 0) goto L_0x001f
            android.app.FragmentTransaction r1 = r3.beginTransaction()
            androidx.lifecycle.o r2 = new androidx.lifecycle.o
            r2.<init>()
            android.app.FragmentTransaction r0 = r1.add(r2, r0)
            r0.commit()
            r3.executePendingTransactions()
        L_0x001f:
            return
    }

    /* renamed from: a */
    private void m1357a(androidx.lifecycle.AbstractC0742e.EnumC0743a r3) {
            r2 = this;
            android.app.Activity r0 = r2.getActivity()
            boolean r1 = r0 instanceof androidx.lifecycle.AbstractC0750i
            if (r1 == 0) goto L_0x0012
            androidx.lifecycle.i r0 = (androidx.lifecycle.AbstractC0750i) r0
            androidx.lifecycle.h r0 = r0.mo1368a()
            r0.m1385a(r3)
            return
        L_0x0012:
            boolean r1 = r0 instanceof androidx.lifecycle.AbstractC0746g
            if (r1 == 0) goto L_0x0025
            androidx.lifecycle.g r0 = (androidx.lifecycle.AbstractC0746g) r0
            androidx.lifecycle.e r0 = r0.mo1368a()
            boolean r1 = r0 instanceof androidx.lifecycle.C0747h
            if (r1 == 0) goto L_0x0025
            androidx.lifecycle.h r0 = (androidx.lifecycle.C0747h) r0
            r0.m1385a(r3)
        L_0x0025:
            return
    }

    /* renamed from: a */
    private void m1356a(androidx.lifecycle.FragmentC0756o.AbstractC0757a r1) {
            r0 = this;
            if (r1 == 0) goto L_0x0005
            r1.m1353a()
        L_0x0005:
            return
    }

    /* renamed from: b */
    private void m1355b(androidx.lifecycle.FragmentC0756o.AbstractC0757a r1) {
            r0 = this;
            if (r1 == 0) goto L_0x0005
            r1.m1352b()
        L_0x0005:
            return
    }

    /* renamed from: c */
    private void m1354c(androidx.lifecycle.FragmentC0756o.AbstractC0757a r1) {
            r0 = this;
            if (r1 == 0) goto L_0x0005
            r1.m1351c()
        L_0x0005:
            return
    }

    @Override // android.app.Fragment
    public void onActivityCreated(android.os.Bundle r1) {
            r0 = this;
            super.onActivityCreated(r1)
            androidx.lifecycle.o$a r1 = r0.f2826b
            r0.m1356a(r1)
            androidx.lifecycle.e$a r1 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_CREATE
            r0.m1357a(r1)
            return
    }

    @Override // android.app.Fragment
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            androidx.lifecycle.e$a r0 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_DESTROY
            r1.m1357a(r0)
            r0 = 0
            r1.f2826b = r0
            return
    }

    @Override // android.app.Fragment
    public void onPause() {
            r1 = this;
            super.onPause()
            androidx.lifecycle.e$a r0 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_PAUSE
            r1.m1357a(r0)
            return
    }

    @Override // android.app.Fragment
    public void onResume() {
            r1 = this;
            super.onResume()
            androidx.lifecycle.o$a r0 = r1.f2826b
            r1.m1355b(r0)
            androidx.lifecycle.e$a r0 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_RESUME
            r1.m1357a(r0)
            return
    }

    @Override // android.app.Fragment
    public void onStart() {
            r1 = this;
            super.onStart()
            androidx.lifecycle.o$a r0 = r1.f2826b
            r1.m1354c(r0)
            androidx.lifecycle.e$a r0 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_START
            r1.m1357a(r0)
            return
    }

    @Override // android.app.Fragment
    public void onStop() {
            r1 = this;
            super.onStop()
            androidx.lifecycle.e$a r0 = androidx.lifecycle.AbstractC0742e.EnumC0743a.ON_STOP
            r1.m1357a(r0)
            return
    }
}

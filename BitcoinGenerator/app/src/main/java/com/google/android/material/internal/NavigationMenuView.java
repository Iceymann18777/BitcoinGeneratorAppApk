package com.google.android.material.internal;

/* loaded from: classes.dex */
public class NavigationMenuView extends androidx.recyclerview.widget.C0813j implements androidx.appcompat.view.menu.AbstractC0515q {
    public NavigationMenuView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NavigationMenuView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public NavigationMenuView(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            r4 = 1
            r0 = 0
            r3.<init>(r2, r4, r0)
            r1.setLayoutManager(r3)
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0515q
    /* renamed from: a */
    public void mo142a(androidx.appcompat.view.menu.C0496h r1) {
            r0 = this;
            return
    }

    public int getWindowAnimations() {
            r1 = this;
            r0 = 0
            return r0
    }
}

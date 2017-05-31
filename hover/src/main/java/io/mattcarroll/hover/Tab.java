package io.mattcarroll.hover;

import android.graphics.Point;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * TODO:
 */
interface Tab {

    @NonNull
    String getTabId();

    @NonNull
    Point getPosition();

    @Nullable
    Point getDockPosition();

    int getTabSize();

    void setTabView(@Nullable View view);

    void addOnPositionChangeListener(@NonNull OnPositionChangeListener listener);

    void removeOnPositionChangeListener(@NonNull OnPositionChangeListener listener);

    interface OnPositionChangeListener {
        void onPositionChange(@NonNull Point position);

        void onDockChange(@NonNull Point dock);
    }

}
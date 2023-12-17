package quyettvph35419.fpoly.testlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

import quyettvph35419.fpoly.testlayout.R;

public class MainActivity extends AppCompatActivity {

    private BottomSheetBehavior<LinearLayout> bottomSheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mainContent = findViewById(R.id.mainContent);
        LinearLayout bottomSheet = findViewById(R.id.bottomSheet);

        // Khởi tạo BottomSheetBehavior từ LinearLayout của BottomSheet
        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);



        // Đặt sự kiện lắng nghe cho sự thay đổi trạng thái của BottomSheet
        bottomSheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(View bottomSheet, int newState) {
                // Xử lý sự kiện khi trạng thái của BottomSheet thay đổi
                switch (newState) {
                    case BottomSheetBehavior.STATE_COLLAPSED:
                        // BottomSheet ở trạng thái thu gọn
                        break;
                    case BottomSheetBehavior.STATE_EXPANDED:
                        // BottomSheet ở trạng thái mở rộng
                        break;
                    case BottomSheetBehavior.STATE_DRAGGING:
                        // Người dùng đang kéo BottomSheet
                        break;
                    case BottomSheetBehavior.STATE_SETTLING:
                        // BottomSheet đang trong quá trình đặt lại vị trí
                        break;
                    case BottomSheetBehavior.STATE_HIDDEN:
                        // BottomSheet đã ẩn đi
                        break;
                }
            }

            @Override
            public void onSlide(View bottomSheet, float slideOffset) {
                // Xử lý sự kiện khi BottomSheet trượt (slide)
                // slideOffset là giá trị từ 0 đến 1, đại diện cho phần trăm trượt của BottomSheet
            }
        });

        // Đặt sự kiện lắng nghe khi người dùng nhấp vào mainContent để mở BottomSheet
        mainContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mở BottomSheet
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });
    }
}

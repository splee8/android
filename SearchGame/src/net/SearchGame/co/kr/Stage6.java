package net.SearchGame.co.kr;

import net.SearchGame.co.kr.Stage.eStageStatus;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;

public class Stage6 extends Stage {
	Stage6(StageMgr stageMgr) {
		super(stageMgr);
		// TODO Auto-generated constructor stub
		m_iId = 6;
	}

	protected Map m_Map = new Map();

	protected CharAni m_CharAni = new CharAni();
	protected CharAni m_CharAni1 = new CharAni();
	protected CharAni m_CharAni2 = new CharAni();
	protected CharAni m_CharAni3 = new CharAni();
	protected CharAni m_CharAni4 = new CharAni();
	protected CharAni m_CharAni5 = new CharAni();
	protected CharAni m_CharAni6 = new CharAni();
	protected CharAni m_CharAni7 = new CharAni();
	protected CharAni m_CharAni8 = new CharAni();
	protected CharAni m_CharAni9 = new CharAni();
	protected CharAni m_CharAni10 = new CharAni();	
	protected CharAni m_CharAni11 = new CharAni();
	protected CharAni m_CharAni12 = new CharAni();
	protected CharAni m_CharAni13 = new CharAni();
	protected CharAni m_CharAni14 = new CharAni();
	protected CharAni m_CharAni15 = new CharAni();
	protected CharAni m_CharAni16 = new CharAni();
	protected CharAni m_CharAni17 = new CharAni();
	protected CharAni m_CharAni18 = new CharAni();
	protected CharAni m_CharAni19 = new CharAni();	
	protected CharAni m_CharAni20 = new CharAni();
	protected CharAni m_CharAni21 = new CharAni();
	protected CharAni m_CharAni22 = new CharAni();
	protected CharAni m_CharAni23 = new CharAni();
	
	protected Char m_Char = null;
	protected Char m_Char1 = null;
	protected Char m_Char2 = null;
	protected Char m_Char3 = null;
	protected Char m_Char4 = null;
	protected Char m_Char5 = null;
	protected Char m_Char6 = null;
	protected Char m_Char7 = null;
	protected Char m_Char8 = null;
	protected Char m_Char9 = null;
	protected Char m_Char10 = null;
	protected Char m_Char11 = null;
	protected Char m_Char12 = null;
	protected Char m_Char13 = null;
	protected Char m_Char14 = null;
	protected Char m_Char15 = null;
	protected Char m_Char16 = null;
	protected Char m_Char17 = null;
	protected Char m_Char18 = null;
	protected Char m_Char19 = null;
	protected Char m_Char20 = null;
	protected Char m_Char21 = null;
	protected Char m_Char22 = null;
	protected Char m_Char23 = null;	
	
	@Override
	boolean ClearStage()
	{
		m_CharMgr.RemoveAll();
		
	    m_CharAni.Setup(m_CharImgMgr, 0, CharAni.Dir.DOWN);
		m_CharAni1.Setup(m_CharImgMgr, 1, CharAni.Dir.DOWN);
		m_CharAni2.Setup(m_CharImgMgr, 2, CharAni.Dir.DOWN);
		m_CharAni3.Setup(m_CharImgMgr, 3, CharAni.Dir.DOWN);
		m_CharAni4.Setup(m_CharImgMgr, 4, CharAni.Dir.DOWN);
		m_CharAni5.Setup(m_CharImgMgr, 5, CharAni.Dir.DOWN);
	    m_CharAni6.Setup(m_CharImgMgr, 6, CharAni.Dir.DOWN);
		m_CharAni7.Setup(m_CharImgMgr, 7, CharAni.Dir.DOWN);
		m_CharAni8.Setup(m_CharImgMgr, 8, CharAni.Dir.DOWN);
		m_CharAni9.Setup(m_CharImgMgr, 9, CharAni.Dir.DOWN);
		m_CharAni10.Setup(m_CharImgMgr, 10, CharAni.Dir.DOWN);
		m_CharAni11.Setup(m_CharImgMgr, 11, CharAni.Dir.DOWN);
		m_CharAni12.Setup(m_CharImgMgr, 12, CharAni.Dir.DOWN);
		m_CharAni13.Setup(m_CharImgMgr, 13, CharAni.Dir.DOWN);
		m_CharAni14.Setup(m_CharImgMgr, 14, CharAni.Dir.DOWN);
		m_CharAni15.Setup(m_CharImgMgr, 15, CharAni.Dir.DOWN);
	    m_CharAni16.Setup(m_CharImgMgr, 16, CharAni.Dir.DOWN);
		m_CharAni17.Setup(m_CharImgMgr, 17, CharAni.Dir.DOWN);
		m_CharAni18.Setup(m_CharImgMgr, 18, CharAni.Dir.DOWN);
		m_CharAni19.Setup(m_CharImgMgr, 19, CharAni.Dir.DOWN);
		m_CharAni20.Setup(m_CharImgMgr, 20, CharAni.Dir.DOWN);
	    m_CharAni21.Setup(m_CharImgMgr, 21, CharAni.Dir.DOWN);
		m_CharAni22.Setup(m_CharImgMgr, 22, CharAni.Dir.DOWN);
		m_CharAni23.Setup(m_CharImgMgr, 23, CharAni.Dir.DOWN);	

		
		m_FxAni.Setup(m_FxImgMgr, 0, 4, null);
		m_FxAni1.Setup(m_FxImgMgr, 1, 8, null);
		m_FxAni2.Setup(m_FxImgMgr, 7, 8, null);
		
		m_Char = new Char(m_CharMgr, m_CharAni,0, 0, 0, 100, 8);
		m_Char1 = new Char(m_CharMgr, m_CharAni1, 1, 64, 0, 100, 8);
		m_Char2 = new Char(m_CharMgr, m_CharAni2, 2, 128, 0, 100, 8);
		m_Char3 = new Char(m_CharMgr, m_CharAni3, 3, 192, 0, 100, 8);
		m_Char4 = new Char(m_CharMgr, m_CharAni4, 4, 256, 0, 100, 8);
		m_Char5 = new Char(m_CharMgr, m_CharAni5, 5, 0, 64, 100, 8);
		m_Char6 = new Char(m_CharMgr, m_CharAni6, 6, 64, 64, 100, 8);
		m_Char7 = new Char(m_CharMgr, m_CharAni7, 7, 128, 64, 100, 8);
		m_Char8 = new Char(m_CharMgr, m_CharAni8, 8, 192, 64, 100, 8);
		m_Char9 = new Char(m_CharMgr, m_CharAni9, 9, 256, 64, 100, 8);
		m_Char10 = new Char(m_CharMgr, m_CharAni10, 10, 0, 128, 100, 8);
		m_Char11 = new Char(m_CharMgr, m_CharAni11, 11, 64, 128, 100, 8);
		m_Char12 = new Char(m_CharMgr, m_CharAni12, 12, 128, 128, 100, 8);
		m_Char13 = new Char(m_CharMgr, m_CharAni13, 13, 192, 128, 100, 8);
		m_Char14 = new Char(m_CharMgr, m_CharAni14, 14, 256, 128, 100, 8);
		m_Char15 = new Char(m_CharMgr, m_CharAni15, 15, 320, 0, 100, 8);
		m_Char16 = new Char(m_CharMgr, m_CharAni16, 16, 320, 64, 100, 8);
		m_Char17 = new Char(m_CharMgr, m_CharAni17, 17, 320, 128, 100, 8);
		m_Char18 = new Char(m_CharMgr, m_CharAni18, 18, 320, 192, 100, 8);
		m_Char19 = new Char(m_CharMgr, m_CharAni19, 19, 0, 192, 100, 8);
		m_Char20 = new Char(m_CharMgr, m_CharAni20, 20, 64, 192, 100, 8);
		m_Char21 = new Char(m_CharMgr, m_CharAni21, 21, 128, 192, 100, 8);
		m_Char22 = new Char(m_CharMgr, m_CharAni22, 22, 192, 192, 100, 8);
		m_Char23 = new Char(m_CharMgr, m_CharAni23, 23, 256, 192, 100, 8);
		
		return true;
	}
	
	@Override boolean Setup(Context context)
	{
		SetupCharMgr(context);
		SetupMap(context);
		SetupFx(context);
		SetupTimer(context);
		SetupScreenQuake(context);
		SetupButtonWindow(context);
		SetupStartMsg(context);
		
		return true;
	}
	
	boolean SetupStartMsg(Context context)
	{
		m_StageResultText.Start(150, 200, "Stage6 Start !!", 300, Global.g_StageResultPaint);
		
		return true;
	}	
	
	boolean SetupButtonWindow(Context context)
	{
		ButtonWindow btn = new ButtonWindow();
		btn.Setup(context, 0, m_FxAni.GetFxImg().GetImg(3), 470, (2 * 64), 32, 32);
		m_ButtonWndMgr.Add(btn);

		
		btn = new ButtonWindow();
		btn.Setup(context, 1, m_FxAni1.GetFxImg().GetImg(3), 470, (2 * 64) + 32, 32, 32);
		m_ButtonWndMgr.Add(btn);

		btn = new ButtonWindow();
		btn.Setup(context, 2, m_FxAni2.GetFxImg().GetImg(3), 470, (2 * 64) + 64, 32, 32);
		m_ButtonWndMgr.Add(btn);
		
		m_ButtonWndMgr.SetSelectedId(0, true);
		
		return true;
	}
	
	boolean SetupScreenQuake(Context context)
	{
		m_ScreenQuake.Setup(30, 4, 0, 10);
		
		return true;
	}
	
	boolean SetupTimer(Context context)
	{
		m_Timer.Setup(context, 224, 0, 60);
		
		return true;
	}
	
	boolean SetupCharMgr(Context context)
	{
		m_CharImgMgr.Setup(context, R.drawable.chr0);
		m_FxImgMgr.Setup(context, 0);
	
		ClearStage();
		
		return true;
	}
	
	boolean SetupMap(Context context)
	{
		m_Map.Setup(context);
	
		return true;
	}
	
	boolean SetupFx(Context context)
	{
		m_FxMgr.Setup(m_CharMgr);
		m_CurFxAni = m_FxAni;
		
		return true;
	}
	
	@Override boolean OnClickedXY(int x, int y)
	{
		super.OnClickedXY(x, y);
		
		m_ButtonWndMgr.OnClicked(x, y);

    	if (m_FxMgr.GetSize() <= 0) {
	    	if (x < m_Map.GetWidthByPixel() && y < m_Map.GetHeightByPixel()) {
		    	
		    	switch(m_ButtonWndMgr.GetSelectedId()) {
			    	case 0:
				    	new Fx(m_FxMgr, m_FxAni, 0, -16, -16, x, y, 32, 32, 2, 2, 8);
			    		break;
			    	case 1:
			    		new Fx(m_FxMgr, m_FxAni1, 0, -24, -24, x, y, 48, 48, 5, 2, 8);
			    		break;
			    	case 2:
			    		new Fx(m_FxMgr, m_FxAni2, 0, -32, -32, x, y, 64, 64, 8, 2, 8);
			    		break;
		    	}
		   	}
    	}

    	return true;
	}
	
	boolean UpdateDeadChar()
	{
		Char frontChar = null;
		if (m_CharMgr.GetSize() > 0) frontChar = m_CharMgr.GetChar(0);
		
		for (int i = 0; i < m_CharMgr.GetSize(); i++) {
			Char chr = m_CharMgr.GetChar(i);
			
			if (chr.GetHP() <= 0) {
				m_ScreenQuake.Start();
				
				m_CharMgr.Remove(chr);
				m_Map.SetXY(chr.GetTileX(), chr.GetTileY(), new Point(7, 5));
				
				if(m_CharMgr.GetSize() <= 0) {
					// 미션 클리어
					m_StageResultText.Start(150, 200, "Stage6 Clear !!", 300, Global.g_StageResultPaint);
					SetStatus(eStageStatus.STAGE_END);
				}
				
				if (frontChar == chr) {
					// 미션 계속 진행
				}
				else {
					// 미션 실패
					ClearStage();
					m_Map.Clear();
					m_StageResultText.Start(150, 200, "Stage6 Failed !!", 300, Global.g_StageResultPaint);
					SetStatus(eStageStatus.STAGE_START);
				}
			}
		}
		
		return true;
	}
	
	@Override boolean Update(int elapsedTime, Context context)
	{
		super.Update(elapsedTime, context);
		if (GetStatus() != m_eStageStatus.STAGE_UPDATE) return false;
		
		m_CharMgr.Update();
		m_FxMgr.Update();
		m_Timer.Update(elapsedTime);
		m_ScreenQuake.Update(elapsedTime);
		m_ButtonWndMgr.Update();
		m_StageResultText.Update(elapsedTime);
		
		UpdateDeadChar();

		
		return true;
	}
	
	@Override boolean Render(Canvas canvas)
	{
		super.Render(canvas);
		
		canvas.drawRect(0, 0, 800, 480, Global.g_BackPaint);
		
		m_ScreenQuake.Render(canvas);
		m_Map.Render(canvas);
		m_CharMgr.Render(canvas);
		m_FxMgr.Render(canvas);
		m_Timer.Render(canvas);
		m_GoalWnd.Render(canvas);
		m_ButtonWndMgr.Render(canvas);
		m_StageResultText.Render(canvas);
		
		canvas.drawRect(0, 0, 448, 480, Global.g_HalfAlphaBackPaint);

		return true;
	}
}

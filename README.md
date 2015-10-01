# PaletteNetworkImageView
Palette-Network-Image-View allows to get swatches and colors (for dynamic theming of layouts) using Volley and Palettes library from a given URL. 

How to use :


    private PaletteNetworkImageView mPaletteNetworkImageView;
    mPaletteNetworkImageView = (PaletteNetworkImageView) findViewById(R.id.palette_network_image_view);
    
    mPaletteNetworkImageView.setImageUrl(url, AppController.getInstance().getImageLoader());
    
    mPaletteNetworkImageView.setResponseObserver(new PaletteNetworkImageView.ResponseObserver() {
      @Override
      public void onSuccess() {
        int darkVibrantColor = mPaletteNetworkImageView.getDarkVibrantColor();
      }
    }
    
    
<img src="http://kushalsharma.in/demo-images/device-2015-03-27-021945.png" alt="Drawing" />
<img src="http://kushalsharma.in/demo-images/device-2015-03-27-021924.png" alt="Drawing" />
